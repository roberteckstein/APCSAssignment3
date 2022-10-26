package com.shs.item;

import com.shs.ItemTemplate;

public class FirePotion extends ItemTemplate {

    public FirePotion() {
        super("FirePotion", "A potion that makes you immune to sun", "You are now resistant to lava");
    }

    @Override
    public boolean isMoveable() {
        return false;
    }

    @Override
    public boolean isGettable() {
        return true;
    }
    @Override
    public boolean isUseable(){
        return true;
    }
}

