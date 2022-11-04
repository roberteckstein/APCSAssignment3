package com.shs.levelOne;

import com.shs.RoomTemplate;

public class EntryRoom1 extends RoomTemplate {
    public EntryRoom1() {
        super("You are in a small cavern with a passage traveling north.", "You are in a small cavern with a passage traveling north. Your adventure starts here.");
        setMoveErrorMessage("The cavern's walls are solid. Right?");


        // Add items/creatures here (watch out for duplicate items across rooms)
    }

}
