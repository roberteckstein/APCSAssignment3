package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.levelOne.RoomSecond;
import com.shs.levelTwo.SecondRoom2;

public class Devil extends CreatureTemplate {
    public Devil() {
        super("devil", "There is a devil here.");
    }
    @Override
    public String use(ItemTemplate target) {

        if (target.getName().equals("sword")&&isAlive())
        {
            setAlive(false);
            return "The devil has been slain, and drops a bright orb.";
        }
        return "";
    }

    @Override
    public String getDescription()
    {
        if (isAlive()) {
            return "The Devil is waiting for you.";
        }
        return "There is only a path north.";
    }
}
