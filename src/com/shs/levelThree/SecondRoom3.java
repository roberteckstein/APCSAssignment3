package com.shs.levelThree;

import com.shs.RoomTemplate;

public class SecondRoom3 extends RoomTemplate {

    public SecondRoom3() {
        super(
                "System.out.print(\"This is the second room.\")",
                "System.out.print(\"This room is very bright although you don't see a light source. You see a passage heading east.\")"
        );
        setMoveErrorMessage("setMoveErrorMessage(\"You touch the wall and it doesn't budge.\")");
    }
}