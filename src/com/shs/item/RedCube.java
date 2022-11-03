package com.shs.item;

import com.shs.ItemTemplate;

// Level 3 Item
public class RedCube extends ItemTemplate {
    public RedCube(){
        super("cube", "There is also a red cube.", "A red cube");
    }

    @Override
    public boolean isGettable() {
        return true;
    }
}
