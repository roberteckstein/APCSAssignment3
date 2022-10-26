package com.shs.item;

import com.shs.ItemTemplate;

public class Lightsaber extends ItemTemplate {

    public Lightsaber() {
        super("lightsaber", "There is a lightsaber here.", "A lightsaber from Star Wars.");
    }

    @Override
    public boolean isMoveable() {
        return true;
    }

    @Override
    public boolean isGettable() {
        return true;
    }

    @Override
    public boolean isOpenable() {
        return false;
    }

    public boolean isLightable() { return true; }

}
