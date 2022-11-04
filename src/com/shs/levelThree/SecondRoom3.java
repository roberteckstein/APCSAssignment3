package com.shs.levelThree;

import com.shs.ItemTemplate;
import com.shs.RoomTemplate;


import com.shs.item.*;

public class SecondRoom3 extends RoomTemplate {

    RedCube redCube = new RedCube();
    BlueSphere blueSphere = new BlueSphere();
    YellowPyramid yellowPyramid = new YellowPyramid();

    public static PurpleBox purpleBox = new PurpleBox();

    private String description1 = "Pacing around the room, something clicks as you step on a hidden button.\nThe floor opens up and you tumble through, into...\n\nA perfectly circular marble room. Almost identical to the last, but noticeably larger.\nThe room contains:";
    private String description2 = "A perfectly circular marble room. Almost identical to the last, but noticeably larger.\nThe room contains:";

    public SecondRoom3() {
        super(
                "A circular marble room. Seems familiar.",
                ""
        );
        setMoveErrorMessage("The walls show neither signs of a path forward...or backward.");
        addItem(redCube);
        addItem(blueSphere);
        addItem(yellowPyramid);
        addItem(purpleBox);
    }

    @Override
    public String getLongDescription() {
        String returnValue;
        if ((itemsInRoom.getItem("cube") != null) && (itemsInRoom.getItem("sphere") != null) && (itemsInRoom.getItem("pyramid") != null) && (itemsInRoom.getItem("box") != null) && (itemsInRoom.size() == 4) && (purpleBox.isOpen() != true)) {
            returnValue = this.description1;
        } else {
            returnValue = this.description2;
        }
        for (ItemTemplate item : itemsInRoom.getInventory()) {
            returnValue += "\n" + item.getDescription();
        }

        return returnValue;


    }

}
