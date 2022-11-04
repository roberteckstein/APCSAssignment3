package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Gatekeeper;
import com.shs.item.Chest;


public class FifthRoom2 extends RoomTemplate {

    Gatekeeper madman = new Gatekeeper();
    public FifthRoom2() {
        //Room description
        super("Base of fortress (north, south, east)", "You are at the base of the fortress of Hell. There are passages heading to the north and south. ");
        setMoveErrorMessage("You can't go there.");

        addItem(madman);
    }
    @Override
    public String getMoveErrorMessage(String direction) {
        if (direction.equals("north") && madman.isAlive()) {
            return "The passage to the north is blocked by the madman.";
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
        if (!result.equals(""))
        {
            TextAdventure.five.addPath("south", TextAdventure.seven);
        }
        return result;
    }
}