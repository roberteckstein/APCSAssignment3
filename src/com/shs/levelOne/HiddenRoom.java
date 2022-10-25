package com.shs.levelOne;
import com.shs.RoomTemplate;
import com.shs.TextAdventure;

public class HiddenRoom extends RoomTemplate {
    public HiddenRoom() {   // Why is there a '...' after String?
        super("Second Room", "This is the second room. There is a passage going south.");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(TextAdventure.dragon);

        }
    }
