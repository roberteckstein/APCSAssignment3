package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;

public class FourthRoom2 extends RoomTemplate {
    public FourthRoom2() {
        //Room description
        super("Entrance of the fortress of Hell", "You are in the entrance of the fortress of Hell. There is a path going from west to east.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}