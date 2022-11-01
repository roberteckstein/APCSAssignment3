package com.shs.levelOne;

import com.shs.RoomTemplate;
import com.shs.item.Crystal;

public class CrystalRoom extends RoomTemplate {
    Crystal crystal = new Crystal();

    public CrystalRoom() {
        super("You are in the crystal storage room. A path lead east.", "You are in the crystal storage room. A path leads east");
        setMoveErrorMessage("There is no exit that way!");
        addItem(crystal);
    }
}
