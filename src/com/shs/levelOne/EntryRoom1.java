package com.shs.levelOne;

import com.shs.RoomTemplate;

public class EntryRoom1 extends RoomTemplate {

    CrystalPouch pouch = new CrystalPouch();
    public EntryRoom1() {
        super("You are in the starting room. A passage travels north.", "You are in the starting room. A passage travels north.");
        setMoveErrorMessage("The room's walls are solid! right?");


        // Add items/creatures here (watch out for duplicate items across rooms)
    }

}
