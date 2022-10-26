package com.shs.item;

import com.shs.ItemTemplate;

public class Method extends ItemTemplate {
    public Method() {
        super("method", "A method.", "An equipped method.");
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
