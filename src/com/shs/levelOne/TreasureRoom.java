package com.shs.levelOne;

import com.shs.RoomTemplate;
import com.shs.item.ExpiredFood;
import com.shs.item.WrittenNote;

public class TreasureRoom extends RoomTemplate {
    public TreasureRoom(){
        super("Vault","This room is filled wall to wall with expired food and empty cabinets, there is an open door leading west");
        setMoveErrorMessage("There is no exit that way!");
        addItem(new ExpiredFood());
        addItem(new WrittenNote());
    }
}
