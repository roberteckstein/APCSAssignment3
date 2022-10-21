package com.shs.room;

import com.shs.TextAdventure;

public class Tomb extends Room {

    public Tomb() {
        super("Tomb", "This is an old tomb lined with several coffins. There is a passage going south.");
        addItem(TextAdventure.dragon);
        setMoveErrorMessage("There is no exit that way!");
    }

}
