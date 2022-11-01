package com.shs.levelThree;

import com.shs.RoomTemplate;

public class CircleRoom extends RoomTemplate{
    public CircleRoom() {
        super("A circular room, with a desk and type-writer in the corner", "You find yourself in a perfectly circular room. Something seems...off." +
                "\nWords and characters cover the white marble walls, floor, and ceiling, in an oddly formatted script:" +
                "\n\"Public\" " +
                "\"Class\" " +
                "\"String\" " +
                "\"Error\"" +
                "\nIn the middle of the room sits a desk.\nA man sits at the desk, frantically typing away on an old-fashioned typewriter.");
        setMoveErrorMessage("The text-covered walls of the room are perfectly smooth, save for a single white door to the north.");
    }

}

//

