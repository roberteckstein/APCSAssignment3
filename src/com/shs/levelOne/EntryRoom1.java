package com.shs.levelOne;

import com.shs.RoomTemplate;

public class EntryRoom1 extends RoomTemplate {
    public EntryRoom1() {
        super("You are in a small cavern. A passage travels north.", "You are in a small cavern. A passage travels north. Your adventure starts here.");
        setMoveErrorMessage("The room's walls are solid! right?");


        // Add items/creatures here (watch out for duplicate items across rooms)
    }

}
