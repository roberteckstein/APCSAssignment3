package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;
import com.shs.TextAdventure;

public class Doggo extends CreatureTemplate {

    public Doggo() {
        super("dog", "There is a hungry dog; he won't let you in.");
    }

    @Override
    public String getDescription() {
        if (isAlive()) {
            return "A hungry dog sits in front of the west facing door.";
        }
        return "You can't seem to find the dog.";
    }

    @Override
    public String use(ItemTemplate target)
    {
        if (target.getName().equals("food")&&isAlive())
        {
            setAlive(false);
            TextAdventure.playerInventory.removeItem("food");
            return "The dog nearly tears your hand off ripping the food away from you. It runs out the door... you can now go to the west.";
        }
        return "";
    }
}


