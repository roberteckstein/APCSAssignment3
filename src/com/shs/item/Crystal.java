package com.shs.item;

import com.shs.ItemTemplate;

public class Crystal extends ItemTemplate {
    public Crystal(){
        super("crystal", "A shimmering crystal lies on the ground.", "A large crystal.");
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
