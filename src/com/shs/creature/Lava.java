package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.levelOne.RoomSecond;
import com.shs.levelTwo.SecondRoom2;
import com.shs.item.FirePotion;

public class Lava extends CreatureTemplate {
    FirePotion fp = new FirePotion();
    public Lava() {
        super("lava", "There is lava blocking your path to the west");
    }
    @Override
    public String use(ItemTemplate target) {

        if (target.getName().equals("potion")&&isAlive())
        {
            setAlive(false);
            TextAdventure.playerInventory.removeItem("potion");
            return "You used the fire potion. The lava is useless in stopping you now.";
        }
        return "";
    }



    @Override
    public String getDescription()
    {
        if (isAlive()) {
            return "The lava blocks your path to the west.";
        }
        return "There is a path to the west.";
    }
}
