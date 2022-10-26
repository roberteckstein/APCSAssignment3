package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Dragon;
import com.shs.item.Chest;
import com.shs.item.Sunball;
import com.shs.item.Sword;

public class EntryRoom2 extends RoomTemplate {
    Dragon dragon = new Dragon();
    Sword sword = new Sword();
    Sunball sunball = new Sunball();
    Chest chest = new Chest();
    public EntryRoom2() {
        //Room description
        super("Space Ship", "You are in the spaceship.");
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(dragon);
        addItem(sword);
        addItem(sunball);
        addItem(chest);

    }
//to exit the room you have to break through a wall
}