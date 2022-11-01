package com.shs.item;
import com.shs.ItemTemplate;

public class Fedora extends ItemTemplate {

    public Fedora() {
        super("fedora", "A snazzy fedora lies on the ground.", "A fedora.");
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

    public boolean isLightable() { return false; }

}

