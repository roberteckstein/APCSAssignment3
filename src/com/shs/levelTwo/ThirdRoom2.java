package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;

public class ThirdRoom2 extends RoomTemplate {
    public ThirdRoom2() {
        //Room description
        super("Depths of Hell (west, north)", "You have reached the very depths of Hell. There is a portal to the north. Please go through it.");
        setMoveErrorMessage("You can't go there.");
    }
}