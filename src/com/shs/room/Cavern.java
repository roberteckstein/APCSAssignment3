package com.shs.room;

import com.shs.TextAdventure;

public class Cavern extends Room {

    public Cavern() {
        super("Cavern", "You are in a wide cavern filled with odd trinkets. A chiseled tunnel travels north into the rock face.");
        addItem(TextAdventure.sword);
        addItem(TextAdventure.chest);
        addItem(TextAdventure.dragon);
        setMoveErrorMessage("The cavern walls are solid rock!");
    }

}
