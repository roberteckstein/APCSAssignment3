package com.shs.levelOne;

import com.shs.RoomTemplate;


public class CrystalRoom extends RoomTemplate {
    public CrystalRoom() {
        super("You are in the crystal storage room. A path lead east.", "You are in the crystal sotrage room. A path leads east");
        setMoveErrorMessage("There is no exit that way!");
    }
}
