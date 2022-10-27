package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.traits.Usable;

public class FirePotion extends ItemTemplate {

    public FirePotion() {
        super("FirePotion", "A potion that makes you immune to heat.", "You are now resistant to fire.");
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

