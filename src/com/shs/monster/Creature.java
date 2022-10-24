package com.shs.monster;

import com.shs.item.ItemTemplate;

public class Creature extends ItemTemplate {

    protected boolean alive;

    public Creature(String name, String description, String equippedDescription) {
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