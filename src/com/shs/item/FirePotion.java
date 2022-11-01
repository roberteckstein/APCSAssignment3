package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.traits.Usable;

public class FirePotion extends ItemTemplate {

    public FirePotion() {
        super("potion", "A potion that makes you immune to hot stuff is on the ground.", "You are now resistant to lava");
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

