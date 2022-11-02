package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;

public class SeventhRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public SeventhRoom2() {
        //Room description
        super("The room is empty, you've already killed the devil. The exit is to the north.", "You meet the final boss. The Devil is waiting for you. The exit is back to the north.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}