package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;
import com.shs.TextAdventure;
import com.shs.item.WaterBucket;

public class Lava extends CreatureTemplate {
    WaterBucket fp = new WaterBucket();
    public Lava() {
        super("lava", "There is lava blocking your path to the west");
    }
    @Override
    public String use(ItemTemplate target) {

        if (target.getName().equals("bucket")&&isAlive())
        {
            setAlive(false);
            TextAdventure.playerInventory.removeItem("bucket");
            return "You used the water bucket. The lava is useless in stopping you now, you can now go west.";
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
