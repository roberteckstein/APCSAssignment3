package com.shs.levelOne;

import com.shs.RoomTemplate;
import com.shs.item.ExpiredFood;
import com.shs.item.WrittenNote;

public class TreasureRoom extends RoomTemplate {
    public TreasureRoom(){
        super("Vault","You are in a room that is filled wall to wall with expired food and empty cabinets. There is an open vault door leading west.");
        setMoveErrorMessage("There is no exit that way!");
        addItem(new ExpiredFood());
        addItem(new WrittenNote());
    }
}
