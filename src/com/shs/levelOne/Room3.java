package com.shs.levelOne;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.creature.Doggo;
import com.shs.item.TastyRock;

public class Room3 extends RoomTemplate{
    static Doggo dog = new Doggo();
    static TastyRock rock = new TastyRock();
    public Room3() {
            super("Doggo room", "You are in a room with sparkling crystal walls. There are exits to the east and west.");
            addItem(dog);
            addItem(rock);

    }
     @Override
     public String getMoveErrorMessage(String direction) {
         if (direction.equals("west") && dog.isAlive()) {
             return "The passage to the west is blocked by a hungry dog. You don't dare go any closer.";
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
            return "You do not have that item.";
        } else if (d == null) {
            return "You can't find anything to use that on.";
        }
        String result = d.use(i);
        if (!result.equals(""))
        {
            TextAdventure.room3.addPath("west", TextAdventure.crystalRoom);
        }
        return result;
    }
}
