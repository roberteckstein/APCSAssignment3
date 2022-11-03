package com.shs.levelThree;

import com.shs.RoomTemplate;

import com.shs.item.Sword;

public class SecondRoom3 extends RoomTemplate {

    Sword sword = new Sword();

    public SecondRoom3() {
        super(
                "This is the second room.",
                "This room is very bright although you don't see a light source. You see a passage heading east."
        );
        setMoveErrorMessage("You touch the wall and it doesn't budge.");
        addItem(sword);
    }
}
