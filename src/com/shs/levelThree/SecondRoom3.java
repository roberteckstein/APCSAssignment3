package com.shs.levelThree;

import com.shs.ItemTemplate;
import com.shs.RoomTemplate;


import com.shs.item.*;

public class SecondRoom3 extends RoomTemplate {


    Doll redDoll = new Doll("red");
    Doll blueDoll = new Doll("blue");
    private String description = "Pacing around the room, something clicks as you step on a hidden button.\nThe floor opens up and you tumble through, into...\n\nA perfectly circular marble room. Almost identical to the last, but noticeably larger.";

    public SecondRoom3() {
        super(
                "A circular marble room. Seems familiar.",
                ""
        );
        setMoveErrorMessage("The walls show neither signs of a path forward...or backward.");
        addItem(redDoll);
        addItem(blueDoll);
    }

    @Override
    public String getLongDescription() {

        String returnValue = this.description;
        for (ItemTemplate item : itemsInRoom.getInventory()) {
            returnValue += "\n" + item.getDescription();
        }

        return returnValue;


    }

}
