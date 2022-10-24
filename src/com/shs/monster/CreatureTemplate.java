package com.shs.monster;

import com.shs.item.ItemTemplate;

public class CreatureTemplate extends ItemTemplate {

    protected boolean alive;

    public CreatureTemplate(String name, String description, String equippedDescription) {
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