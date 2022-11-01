package com.shs.item;

import com.shs.ItemTemplate;

public class SmallStatue extends ItemTemplate {
    public SmallStatue(){
        super("statue", "A small engraved statue about half a foot tall sits on the ground.", "A small statue of a young man, about half a foot tall. \nEngraved in the base is what appears to be a name: ( |-| R | S");

    }
    public boolean isGettable() {
        return true;
    }
}