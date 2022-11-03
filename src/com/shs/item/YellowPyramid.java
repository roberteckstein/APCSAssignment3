package com.shs.item;

import com.shs.ItemTemplate;

// Level 3 Item
public class YellowPyramid extends ItemTemplate {
    public YellowPyramid(){
        super("pyramid", "A yellow pyramid.", "A yellow pyramid");
    }

    @Override
    public boolean isGettable() {
        return true;
    }
}
