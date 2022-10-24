package com.shs.levelTwo;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class levelTwo extends RoomTemplate {

    public levelTwo() {
        //Room description
        super("Second Room", "This is the second room.");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(TextAdventure.dragon);

    }

}