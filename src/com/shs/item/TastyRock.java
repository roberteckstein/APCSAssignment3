package com.shs.item;

import com.shs.ItemTemplate;

// Level 1 Item
public class TastyRock extends ItemTemplate {

    public TastyRock() {
        super("rock", "A pink rock made of salt lies on the ground.", "A pink rock made of salt. It's heavier than it looks.");
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
