package com.shs.levelOne;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Doggo;

// HI IM A COMMENT
public class Room3 extends RoomTemplate{
    static Doggo dog = new Doggo();
    public Room3() {
            super("Starting Room", "You are in the starting room. A passage travels north.");
            setMoveErrorMessage("The room's walls are solid!");
            addItem(dog);

    }
     @Override
     public String getMoveErrorMessage(String direction) {
         if (direction.equals("west") && dog.isAlive()) {
             return "The passage to the north is blocked by the crystal elemental.";
         } else {
             return getMoveErrorMessage();
         }
     }
}
