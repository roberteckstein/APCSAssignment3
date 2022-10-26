package com.shs.levelOne;
import com.shs.RoomTemplate;
import com.shs.TextAdventure;
import com.shs.creature.Elemental;
import com.shs.item.SmallStatue;

public class MinerRoom extends RoomTemplate {
    public MinerRoom() {   // Why is there a '...' after String?
        super("miner's room", "a small room with a miner and a crystal golem in each corner, to the west is an incredibly dark passage, the the east an open vault door, abandoned.");

        // Add items/creatures here (watch out for duplicate objects across rooms)

    }
}

