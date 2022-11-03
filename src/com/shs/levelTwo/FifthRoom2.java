package com.shs.levelTwo;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Chest;


public class FifthRoom2 extends RoomTemplate {


    public FifthRoom2() {
        //Room description
        super("Base of fortress (north, south, east)", "You are at the base of the fortress with rooms in the north and south. Something growls in the south, so you should probably check the north room first.");
        setMoveErrorMessage("You can't go there.");
    }
    @Override
    public String getMoveErrorMessage(String direction) {
        if (direction.equals("south")) {
            if (!TextAdventure.playerInventory.checkInventory("sword")) {
                return "You need a sword to enter this room.";
            } else {
                TextAdventure.five.addPath("south", TextAdventure.seven);
                TextAdventure.currentRoom = TextAdventure.currentRoom.getRoomAt(direction);
                TextAdventure.addTurn();
                return TextAdventure.currentRoom.getLongDescription();
            }
        } else {
            return getMoveErrorMessage();
        }
    }
}