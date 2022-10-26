package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;

public class FourthRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public FourthRoom2() {
        //Room description
        super("The room is full of lava. You need a strong fire resistance potion to go through.", "Already visited.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}