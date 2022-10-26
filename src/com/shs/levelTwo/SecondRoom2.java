package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;
import com.shs.item.Sunball;
import com.shs.item.Sword;

public class SecondRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    public SecondRoom2() {
        //Room description
        super("You are in an empty room. There is a chest", "The room is empty.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(chest);
    }
}