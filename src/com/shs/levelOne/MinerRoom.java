package com.shs.levelOne;

import com.shs.RoomTemplate;

public class MinerRoom extends RoomTemplate {
    public MinerRoom() {   // Why is there a '...' after String?
        super("You are in the miner's room.", "A pickaxe lies on the floor. A small room with a miner and a crystal golem in each corner, to the west is an incredibly dark passage, the the east an open vault door, abandoned.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}

