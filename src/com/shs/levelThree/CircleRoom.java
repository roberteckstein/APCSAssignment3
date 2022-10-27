package com.shs.levelThree;

import com.shs.RoomTemplate;

public class CircleRoom extends RoomTemplate{
    public CircleRoom() {
        super("A circular room", "You find yourself in a perfectly circular room. Something seems... off." +
                "\nWords and characters cover the white marble walls, floor, and ceiling in an oddly formatted script." +
                "\n\"Public\"" +
                "\n\"Class\"" +
                "\n\"String\"" +
                "\n\"Error\"" +
                "\nWhat could it all mean? In the middle of the room sits a desk.\nA man sits at the desk, frantically typing away on an old-fashioned typewriter.");
        setMoveErrorMessage("setMoveErrorMessage(\"You can't go there.\")");
    }

}

//

