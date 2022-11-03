package com.shs.levelThree;

import com.shs.RoomTemplate;
import com.shs.item.*;

public class CircleRoom extends RoomTemplate{

    Toaster toaster = new Toaster();
    BreadSlice breadslice = new BreadSlice();
    public CircleRoom() {
        super("A perfectly circular room.", "You find yourself in a circular room with white marble walls making a perfect circle.");
        setMoveErrorMessage("The circular walls show no signs of either a doorway forward...or backward.");
        addItem(toaster);
        addItem(breadslice);

    }

}

//

