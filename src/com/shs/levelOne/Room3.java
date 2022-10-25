package com.shs.levelOne;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class Room3 extends RoomTemplate{
    public Room3() {
            super("Starting Room", "You are in the starting room. A passage travels north.");
            setMoveErrorMessage("The room's walls are solid!");
        }
}
