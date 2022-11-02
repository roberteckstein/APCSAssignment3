package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;
import com.shs.TextAdventure;

public class Lava extends CreatureTemplate {

    public Lava() {
        super("lava", "There is lava blocking your path to the west");
    }

    @Override
    public String use(ItemTemplate target)
    {
        if (target.getName().equals("potion")&&isAlive())
        {
            setAlive(false);
            TextAdventure.playerInventory.removeItem("potion");
            return "You used the fire potion. The lava is useless in stopping you now.";
        }
        return "";
    }

    @Override
    public String getDescription()
    {
        if (isAlive())
        {
            return "The lava blocks your path to the west.";
        }
        return "There is a path to the west.";
    }
}
