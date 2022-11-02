package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.traits.Usable;

public class WaterBucket extends ItemTemplate {

    public WaterBucket() {
        super("bucket", "A water bucket full of water lies in the corner.", "A bucket of water.");
    }

    @Override
    public boolean isMoveable() {
        return false;
    }

    @Override
    public boolean isGettable() {
        return true;
    }

}

