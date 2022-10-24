package com.shs.levelTwo;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class StartingRoom extends RoomTemplate {

    public StartingRoom() {
        //Room description
        super("Starting Room", "This is the starting room.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(TextAdventure.dragon);

    }

}