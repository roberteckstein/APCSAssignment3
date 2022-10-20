package com.shs.monster;

import com.shs.item.Item;

public class Monster extends Item {

    protected boolean alive;

    public Monster(String name, String description, String equippedDescription) {
        super(name, description, equippedDescription);
        this.alive = true;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
