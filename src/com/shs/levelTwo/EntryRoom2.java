package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;

public class EntryRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public EntryRoom2() {
        //Room description
        super("You are at the gates of Hell.", "You are at the gates of Hell.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}