package com.shs.item;

import com.shs.ItemTemplate;

public class Class extends ItemTemplate {
    public Class() {
        super("class", "A class.", "An equipped class.");
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
