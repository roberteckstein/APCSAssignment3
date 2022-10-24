package com.shs.room;

import com.shs.TextAdventure;

public class RoomSecond extends RoomTemplate {

    public RoomSecond() {
        super("Second Room", "This is the second room.");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(TextAdventure.dragon);
    }

}
