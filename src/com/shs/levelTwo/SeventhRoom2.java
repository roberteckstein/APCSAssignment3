package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;
import com.shs.creature.Devil;
import com.shs.item.Sunball;

public class SeventhRoom2 extends RoomTemplate {

    Sunball sunball = new Sunball();
    Devil devil = new Devil();
    public SeventhRoom2() {
        //Room description
        super("The room is empty, you've already killed the devil.", "You meet the final boss.");
        setMoveErrorMessage("You can't go there.");
        addItem(devil);
        devil.setAlive(true);

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
    public String use(String target, String directObject) {
        ItemTemplate i = TextAdventure.playerInventory.getItem(target);
        ItemTemplate d = getItem(directObject);
        if (d == null) {
            d = TextAdventure.playerInventory.getItem(directObject);
        }

        if (i == null) {
            return "You do not have that item.";
        } else if (d == null) {
            return "You can't find that to use the item on.";
        }
        String result = d.use(i);
        if (!result.equals(""))
        {
            devil.setAlive(false);
            setAlreadyVisited(true);
            TextAdventure.five.setAlreadyVisited(true);
            System.out.println("The devil has been slain, and drops a sunball.");
            addItem(sunball);
            return sunball.getDescription();
        }
        return result;
    }
}