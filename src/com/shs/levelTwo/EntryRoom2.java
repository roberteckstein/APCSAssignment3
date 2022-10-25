package com.shs.levelTwo;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class EntryRoom2 extends RoomTemplate {

    public EntryRoom2() {
        //Room description
        super("Starting Room", "This is the starting room.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(TextAdventure.dragon);
        addItem(TextAdventure.sword);
        addItem(TextAdventure.lantern);
        addItem(TextAdventure.chest);

    }
//to exit the room you have to break through a wall
}