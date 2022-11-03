package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;
import com.shs.item.Sword;

public class SixthRoom2 extends RoomTemplate {
    Sword sword = new Sword();
    public SixthRoom2() {
        //Room description
        super("The storage room.", "You are in the storage room.");
        addItem(sword);
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}