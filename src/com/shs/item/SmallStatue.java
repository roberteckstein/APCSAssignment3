package com.shs.item;

import com.shs.ItemTemplate;

public class SmallStatue extends ItemTemplate {
    public SmallStatue(){
        super("statue", "a small engraved statue about half a foot tall", "a small statue of a young man, about half a foot tall, engraved in the base is what apears to be a name: ( |-| R | S");

    }
    public boolean isGettable() {
        return true;
    }
}