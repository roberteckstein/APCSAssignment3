package com.shs.levelOne;

import com.shs.RoomTemplate;

public class TreasureRoom extends RoomTemplate {
    public TreasureRoom(){
        super("Vault","This room is filled wall to wall with expired food, there is an open door leading west");
        setMoveErrorMessage("There is no exit that way!");
    }
}
