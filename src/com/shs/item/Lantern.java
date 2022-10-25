package com.shs.item;

import com.shs.ItemTemplate;

public class Lantern extends ItemTemplate {

    public Lantern() {
        super("lantern", "This is a battery powered lantern", "The lantern is lighting up the room.");
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
    public boolean isLightable() { return true; }
}
