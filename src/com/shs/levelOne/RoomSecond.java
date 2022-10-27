package com.shs.levelOne;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Elemental;
import com.shs.item.Chest;
import com.shs.levelOne.Room3;

import static com.shs.TextAdventure.minerRoom;


public class RoomSecond extends RoomTemplate {

    Chest chest = new Chest();
    Elemental elemental = new Elemental();
    public RoomSecond() {
        super("Second Room", "This is the second room. There is a passage going North, South and West");
        setMoveErrorMessage("There is no exit that way!");

        // Add items/creatures here (watch out for duplicate objects across rooms)
        addItem(chest);
        addItem(elemental);

    }
    @Override
    public String getLongDescription()
    {
        if (elemental.isAlive())
        {
            return "This is the second room. There is a passage going North, South and West. The passage to the north is blocked by a large crystal elemental";
        }
        return "This is the second room. There is a passage going North, South and West. A crystal elemental sits in the corner licking a rock.";
    }

    @Override
    public String getMoveErrorMessage(String direction) {
        if (direction.equals("north") && elemental.isAlive()) {
            return "The passage to the north is blocked by the crystal elemental.";
        } else {
            return getMoveErrorMessage();
        }
    }

    //i have ZERo clue how use works, i can't figure it out but i kinda have some stuff laid
    // out so you can see what i was trying to do,
    // also tried doing it in room3 but i couldnt figure that out either - dean
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
        if (!result.equals("")) {
            TextAdventure.roomSecond.addPath("north", minerRoom);
        }
        return result;
    }
}
