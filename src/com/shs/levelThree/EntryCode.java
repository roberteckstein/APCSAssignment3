package com.shs.levelThree;

import com.shs.RoomTemplate;

public class EntryCode extends RoomTemplate{
    public EntryCode() {
        super("System.out.print(\"An empty room.\")", "System.out.print(\"It's the level three starting room!\")");
        setMoveErrorMessage("setMoveErrorMessage(\"You can't go there.\")");
    }

}


