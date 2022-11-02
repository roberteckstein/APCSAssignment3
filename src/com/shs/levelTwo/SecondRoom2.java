package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Lava;
import com.shs.item.Chest;
import com.shs.item.Sunball;
import com.shs.item.Sword;
import com.shs.ContainerTemplate;
import com.shs.item.FirePotion;


public class SecondRoom2 extends RoomTemplate {
    FirePotion potion = new FirePotion();
    Lava lava = new Lava();
    public SecondRoom2() {
        //Room description
        super("Middle of Hell", "You are in the middle of Hell.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(lava);
        lava.setAlive(true);
        addItem(potion);
    }
    @Override
    public String getMoveErrorMessage(String direction) {
        if (direction.equals("west") && lava.isAlive()) {
            return "The passage to the west is blocked by lava in your way.";
        } else {
            return getMoveErrorMessage();
        }
    }
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
            return "You can't find that to use the item on.";
        }
        String result = d.use(i);
        if (!result.equals(""))
        {
            lava.setAlive(false);
            TextAdventure.two.addPath("west", TextAdventure.four);
        }
        return result;
    }
}