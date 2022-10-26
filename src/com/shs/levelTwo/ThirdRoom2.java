package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;

public class ThirdRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public ThirdRoom2() {
        //Room description
        super("You are in a giant, dark room. You need a massive light source to see where to go.", "Already visited.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}