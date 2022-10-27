package com.shs.item;

import com.shs.ItemTemplate;

public class Crystal extends ItemTemplate {
    public int Crystals = 0;
    public Crystal(){
        super("crystal", "crystals lay on the ground.", "Some crystals");
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