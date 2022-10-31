package com.shs.levelOne;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Doggo;
import com.shs.creature.Elemental;
import com.shs.item.Chest;
import com.shs.item.Fedora;
import com.shs.item.TastyRock;


public class RoomSecond extends RoomTemplate {

    Elemental elemental = new Elemental();
    static Fedora fedora = new Fedora();
    public RoomSecond() {
        super("Second Room", "You are in a room that looks like a normal junction. There is a passage going North, South and West.");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(elemental);
        addItem(fedora);
    }

    @Override
    public String getMoveErrorMessage(String direction) {
        if (direction.equals("north") && elemental.isAlive()) {
            return "The passage to the north is blocked by the crystal elemental.";
        } else {
            return getMoveErrorMessage();
        }
    }

    @Override
    public String use(String target, String directObject)
    {
        ItemTemplate i = TextAdventure.playerInventory.getItem(target);
        ItemTemplate d = getItem(directObject);


        if (d == null) {
            d = TextAdventure.playerInventory.getItem(directObject);
        }

        if (i == null) {
            return "You do not have a " + target + ".";
        } else if (d == null) {
            return "You do not see the " + directObject + ".";
        }
        String result = d.use(i);
        if (!result.equals(""))
        {
            TextAdventure.roomSecond.addPath("north", TextAdventure.minerRoom);
        }
        return result;
    }
}
