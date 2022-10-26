package com.shs.levelOne;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.TastyRock;

// HI IM A COMMENT
public class Room3 extends RoomTemplate{
    TastyRock rock = new TastyRock();
    public Room3() {
            super("The passage to the west is blocked. A passage leads east.", "The walls cave in to the west! Maybe you could remove the blockage...");
            setMoveErrorMessage("The room's walls are solid!");
            addItem(rock);
    }

     @Override
     public String getMoveErrorMessage(String direction) {
         if (direction.equals("west")) {
             return "The passage to the west is blocked by a cave in. There may be someway to remove it...";
         } else {
             return getMoveErrorMessage();
         }
     }

}
