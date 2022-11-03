package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;
import com.shs.item.Fedora;
import com.shs.item.Sword;

public class SixthRoom2 extends RoomTemplate {
    Sword sword = new Sword();
    Fedora fedora = new Fedora();
    public SixthRoom2() {
        //Room description
        super("You seem to be inside a storage room. A path leads south.", "You are in the storage room.");
        addItem(sword);
        addItem(fedora);

        setMoveErrorMessage("You can't go there.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}