package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class SeventhRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public SeventhRoom2() {
        //Room description
        super("You meet the final boss. The Devil is waiting for you.", "Already killed the Devil. You may now proceed to level 3.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}