package com.shs.levelOne;
import com.shs.RoomTemplate;
import com.shs.TextAdventure;
import com.shs.creature.Elemental;
import com.shs.item.SmallStatue;

public class MinerRoom extends RoomTemplate {
    public MinerRoom() {   // Why is there a '...' after String?
        super("miner's room", "You are in a small room full of empty racks for tools. To the west is an incredibly dark passage, to the east an open vault door, abandoned. \nThere is also a passage leading south.");

        // Add items/creatures here (watch out for duplicate objects across rooms)

    }
}

