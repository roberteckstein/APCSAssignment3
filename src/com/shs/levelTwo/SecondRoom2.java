package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;
import com.shs.item.Sunball;
import com.shs.item.Sword;
import com.shs.ContainerTemplate;
import com.shs.item.FirePotion;


public class SecondRoom2 extends RoomTemplate {
    Chest chest = new Chest();
    FirePotion potion = new FirePotion();
    public SecondRoom2() {
        //Room description
        super("", "You are in an empty room. There is a chest.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(chest);
    }
}