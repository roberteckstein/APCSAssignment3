package com.shs.item;

import com.shs.ItemTemplate;

// Level 3 Item
public class Toast extends ItemTemplate {

    public Toast() {
        super("toast", "A slightly burnt piece of toast.", "Burnt toast");
    }
        @Override
        public boolean isMoveable() {
            return true;
        }
    
        @Override
        public boolean isGettable() {
            return true;
        }
}
