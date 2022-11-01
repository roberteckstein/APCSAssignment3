package com.shs.levelOne;
import com.shs.RoomTemplate;
import com.shs.TextAdventure;
import com.shs.item.SmallStatue;
import com.shs.item.Chest;

public class HiddenRoom extends RoomTemplate {
    public HiddenRoom() {   // Why is there a '...' after String?
        super("secret room", "You are in a room that appears to have been kept secret. The stone wall you walked through has solidified. There is a passage going north.");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(new SmallStatue());

        }
    }

