package com.shs.item;

import com.shs.ItemTemplate;

// Level 3 Item
public class Class extends ItemTemplate {
    public Class() {
        super("class", "A class.", "An equipped class.");
    }

    @Override
    public boolean isGettable() {
        return true;
    }

}
