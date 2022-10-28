package com.shs.levelOne;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Doggo;
import com.shs.item.TastyRock;
import com.shs.Inventory;
import com.shs.item.Crystal;

public class Room3 extends RoomTemplate{
    Doggo dog = new Doggo();
    TastyRock rock = new TastyRock();
    public Room3() {
            super("A passage leads east and west. The west passage is blocked by a hungry dog.", "A hungry looking dog blocks a dor facing west.");
            addItem(rock);
            addItem(dog);
    }

    @Override
    public String getLongDescription()
    {
        if (dog.isAlive())
        {
            return "There is a passage going North, South and West. The passage to the west is blocked by a hungry looking dog.";
        }
        return "There is a passage going North, South and West. The path to the west is clear.";
    }

    @Override
    public String getMoveErrorMessage(String direction) {
        if (direction.equals("west") && dog.isAlive()) {
            return "The passage to the north is blocked by a hungry dog.";
        } else {
            return getMoveErrorMessage();
        }
    }

    @Override
    public String use(String target, String directObject)
    {
        ItemTemplate i = TextAdventure.playerInventory.getItem(target);
        ItemTemplate d = getItem(directObject);


        if (d == null) {
            d = TextAdventure.playerInventory.getItem(directObject);
        }

        if (i == null) {
            return "You do not have a " + target + ".";
        } else if (d == null) {
            return "You do not see the " + directObject + ".";
        }
        String result = d.use(i);
        if (!result.equals("")) {
            TextAdventure.room3.addPath("west", TextAdventure.crystalRoom);
        }
        return result;
    }
}
