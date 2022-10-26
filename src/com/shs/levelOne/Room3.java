package com.shs.levelOne;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.TastyRock;
import com.shs.Inventory;
import com.shs.item.Crystal;
import static com.shs.TextAdventure.crystalRoom;

// i hid out he doggo for now until we can get the use function working -dean
public class Room3 extends RoomTemplate{
    //static Doggo dog = new Doggo();
    TastyRock rock = new TastyRock();
    Crystal Crystals = new Crystal();
    public Room3() {
            super("There is a cave in to the west, maybe you can clear it out?", "The wall to the west is caved in, maybe you could clear it out somehow.. A corridor leads east.");
            addItem(rock);
            addItem(Crystals);
    }

    @Override
     public String getMoveErrorMessage(String direction) {
         if (direction.equals("west")) {
             return "The passage to the west is blocked by the cave in.";
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
        if (!result.equals("pickaxe"))
        {
            System.out.println("You use the pickaxe to break the stone.");
            TextAdventure.room3.addPath("west", crystalRoom);
        }
        return result;
    }
}
