package com.shs.room;

import com.shs.TextAdventure;

public class StartingRoom extends RoomTemplate {


    public StartingRoom() {
        super("Starting Room", "You are in the starting room. A passage travels north.");
        setMoveErrorMessage("The room's walls are solid!");


        // Add items/creatures here (watch out for duplicate items across rooms)
        addItem(TextAdventure.sword);
        addItem(TextAdventure.chest);
    }

}
