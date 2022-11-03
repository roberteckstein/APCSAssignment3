package com.shs.item;

import com.shs.ItemTemplate;

// Level 3 Item
public class BlueSphere extends ItemTemplate {
    public BlueSphere(){
        super("sphere", "A blue sphere.", "A blue sphere");
    }

    @Override
    public boolean isGettable() {
        return true;
    }
}
