package com.shs.levelOne;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class EntryRoom1 extends RoomTemplate {


    public EntryRoom1() {
        super("Starting Room", "You are in the starting room. A passage travels north.");
        setMoveErrorMessage("The room's walls are solid!");


        // Add items/creatures here (watch out for duplicate items across rooms)
        addItem(TextAdventure.sword);
        addItem(TextAdventure.chest);
    }

}
