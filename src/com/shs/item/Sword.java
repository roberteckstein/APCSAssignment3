package com.shs.item;

import com.shs.ItemTemplate;

public class Sword extends ItemTemplate {

    public Sword() {
        super("sword", "There is a sword here.", "A sword");
    }

    @Override
    public boolean isMoveable() {
        return true;
    }

    @Override
    public boolean isGettable() {
        return true;
    }

    @Override
    public boolean isOpenable() {
        return false;
    }
}
