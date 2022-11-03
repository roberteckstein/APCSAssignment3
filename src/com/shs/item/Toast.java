package com.shs.item;

import com.shs.ItemTemplate;

// Level 3 Item
public class Toast extends ItemTemplate {

    public Toast() {
        super("toast", "Burnt toast lies on the ground: \"Follow the walls\"", "Burnt toast: \"Follow the walls.\"");
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
