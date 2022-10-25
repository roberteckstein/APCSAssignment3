package com.shs.levelTwo;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class EntryRoom2 extends RoomTemplate {

    public EntryRoom2() {
        //Room description
        super("Space Ship", "You are in the spaceship.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(TextAdventure.dragon);
        addItem(TextAdventure.sword);
        addItem(TextAdventure.sunball);
        addItem(TextAdventure.chest);

    }
//to exit the room you have to break through a wall
}