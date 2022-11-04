package com.shs.levelOne;

import com.shs.RoomTemplate;
import com.shs.item.Crystal;

public class CrystalRoom extends RoomTemplate {
    Crystal crystal = new Crystal();

    public CrystalRoom() {
        super("You are in what seems to be a crystal storage room. A path leads east.", "You are in what seems to be a crystal storage room. A path leads east.");
        setMoveErrorMessage("There is no exit that way!");
        addItem(crystal);
    }
}
