package com.shs.levelThree;

import com.shs.RoomTemplate;
import com.shs.item.*;
import com.shs.TextAdventure;

public class CircleRoom extends RoomTemplate{

    Box box = new Box();
    WrittenNote2 paper = new WrittenNote2();
    public CircleRoom() {
        super("A perfectly circular room.", "You find yourself in a massive circular room, with walls of smooth white marble. All is silent.");
        setMoveErrorMessage("The smooth, featureless walls offer no hint of a way forward.");
        addItem(box);
        addItem(paper);

    }

}

//

