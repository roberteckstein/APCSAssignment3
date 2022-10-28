package com.shs.levelOne;

import com.shs.RoomTemplate;

public class MinerRoom extends RoomTemplate {
    public MinerRoom() {   // Why is there a '...' after String?
        super("You are in the miner's room.", "A small room with crystal golem in the corner, to the west is an incredibly dark passage, to the east an open vault door, abandoned. And passage and to the south.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
    }
}

