package com.shs.levelTwo;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Dragon;
import com.shs.item.Chest;
import com.shs.item.Sword;

public class EntryRoom2 extends RoomTemplate {

    private Dragon dragon;
    private Sword sword;
    private Chest chest;
    //Lantern lantern;
    public EntryRoom2() {
        super("Starting Room", "This is the starting room.");
        //Room description
        dragon = new Dragon();
        sword = new Sword();
        //Lantern lantern = new Lantern();
        chest = new Chest();
        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(dragon);
        addItem(sword);
        //addItem(lantern);
        addItem(chest);

    }
//to exit the room you have to break through a wall
}