package com.shs.item;

import com.shs.ItemTemplate;

public class Pickaxe extends ItemTemplate {
    public Pickaxe() {
        super("pickaxe", "A pickaxe lays on the ground", "A sturdy pickaxe.");

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
