package com.shs.levelOne;
import com.shs.RoomTemplate;
import com.shs.TextAdventure;
import com.shs.creature.Elemental;
import com.shs.item.SmallStatue;

public class MinerRoom extends RoomTemplate {
    public MinerRoom() {   // Why is there a '...' after String?
        super("elemental room", "Stepping into the room, an elemental blocks your path. You can barely see there are passages to the east, west, and south.");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(new Elemental());

    }
}

