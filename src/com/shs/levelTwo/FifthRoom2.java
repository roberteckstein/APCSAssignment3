package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;


public class FifthRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public FifthRoom2() {FifthRoom2.java
        //Room description
        super("You are at the base of the fortress with a path leading north and south. Something growls in the south, so you should probably check the north room first.", "Already visited.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}