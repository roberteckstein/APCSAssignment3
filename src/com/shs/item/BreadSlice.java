package com.shs.item;

import com.shs.ItemTemplate;

// Level 3 Item
public class BreadSlice extends ItemTemplate {

    public BreadSlice() {
        super("bread", "Across the room, a slice of bread sits on a table.", "Slice of bread");
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
