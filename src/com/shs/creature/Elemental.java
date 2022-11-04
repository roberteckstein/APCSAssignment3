package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;
import com.shs.TextAdventure;

public class Elemental extends CreatureTemplate {

    public Elemental() {
        super("elemental", "There is an elemental blocking your path.");
    }

    @Override
    public String use(ItemTemplate target)
    {
        if (target.getName().equals("rock")&&isAlive())
        {
            setAlive(false);
            TextAdventure.playerInventory.removeItem("rock");
            return "The elemental grabs the salt rock and recedes into the corner of the room. Before he turns he's already licking the rock. The north door is now open.";
        }
        return "";
    }

    @Override
    public String getDescription()
    {
        if (isAlive())
        {
            return "An elemental stands blocking the passage to the north.";
        }
        return "An elemental sits in the corner licking a rock.";
    }
}
