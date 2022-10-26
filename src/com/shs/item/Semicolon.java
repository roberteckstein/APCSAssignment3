package com.shs.item;

import com.shs.ItemTemplate;

public class Semicolon extends ItemTemplate {
    public Semicolon() {
        super("Semicolon", "A strange semicolon shaped object.", "A semicolon outside the computer!");
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
