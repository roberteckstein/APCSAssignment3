package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;

public class Elemental extends CreatureTemplate {

    public Elemental() {
        super("elemental", "There is an elemental blocking your path");
    }

    @Override
    public String use(ItemTemplate target)
    {
        if (target.getName().equals("rock")&&isAlive())
        {
            setAlive(false);
            return "The elemental grabs the salt rock and recedes into the corner of the room. Before he even turns he's already licking the rock.";
        }
        return "";
    }
}
