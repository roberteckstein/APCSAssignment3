package com.shs.item;

import com.shs.ItemTemplate;

public class Lightsaber extends ItemTemplate {

    public Lightsaber() {
        super("Lightsaber", "There is a Lightsaber here.", "A Lightsaber from Star Wars.");
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
