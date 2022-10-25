package com.shs.levelOne;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class RoomSecond extends RoomTemplate {

    public RoomSecond() {
        super("Second Room", "This is the second room. There is a passage going south.");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(TextAdventure.dragon);

    }

}
