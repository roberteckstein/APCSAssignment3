package com.shs.levelOne;
import com.shs.RoomTemplate;
import com.shs.TextAdventure;
import com.shs.item.SmallStatue;

public class HiddenRoom extends RoomTemplate {
    public HiddenRoom() {   // Why is there a '...' after String?
        super("secret room", "This is the hidden room. A stone wall materializes behind you There is a passage going north.");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(new SmallStatue());

        }
    }

