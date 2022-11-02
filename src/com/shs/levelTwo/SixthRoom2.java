package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;

public class SixthRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public SixthRoom2() {
        //Room description
        super("", "You are in a barren room, say for a single chest. There is a door to the south.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}