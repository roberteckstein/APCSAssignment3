package com.shs.levelOne;

import com.shs.ItemTemplate;
import com.shs.RoomTemplate;
import com.shs.TextAdventure;
import com.shs.creature.Door;

public class FinalRoom extends RoomTemplate {
    Door door = new Door();
    public FinalRoom() {   // Why is there a '...' after String?
        super("", "");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(door);
    }
    @Override
    public String getLongDescription()
    {
        if (door.isAlive())
        {
            return "It's dark and you can barely see. You make out a door with text that reads, \"The crystal is the key.\" There is an indent in the wall where something could go.";
        }
        return "You are in a dark room with an open dor radiating heat with a faint glow of orange visible.";
    }

    @Override
    public String getMoveErrorMessage(String direction) {
        if (direction.equals("north") && door.isAlive()) {
            return "The passage to the north closed off by a large door.";
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
            return "You do not have that item.";
        } else if (d == null) {
            return "You can't find anything to use that on.";
        }
        String result = d.use(i);
        if (!result.equals("")) {
            TextAdventure.finalRoom.addPath("north", TextAdventure.one);
        }
        return result;
    }
}
