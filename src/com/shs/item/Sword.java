package com.shs.item;

public class Sword extends Item {

    public Sword() {
        super("sword", "There is a tall, glowing sword lying in a pile of treasures.", "A glowing sword.");
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
}
