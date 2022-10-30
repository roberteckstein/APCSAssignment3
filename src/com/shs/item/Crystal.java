package com.shs.item;

import com.shs.ItemTemplate;

// Level 1 Item
public class Crystal extends ItemTemplate {
    public Crystal(){
        super("crystal", "A shimmering crystal lies on the ground.", "A large crystal.");
    }

    @Override
    public boolean isGettable() {
        return true;
    }
}
