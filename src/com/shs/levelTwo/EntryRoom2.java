package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;

public class EntryRoom2 extends RoomTemplate {
    public EntryRoom2() {
        //Room description
        super("Gates of Hell (north)", "You are at the gates of Hell. The door behind you slams shut, the only way is north.");
        setMoveErrorMessage("The door behind you is locked shut. The only way forward is north.");
        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}