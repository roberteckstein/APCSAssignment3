package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.traits.Lightable;

public class Sunball extends ItemTemplate implements Lightable {

    boolean light = false;
    public Sunball() {
        super("lantern", "This is a battery powered lantern", "The lantern is lighting up the room.");
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
    public boolean islightable() {
        return false;
    }
    public boolean isLightable() { return true; }

    public String setLightability(boolean light) {
        if (this.light == true) {
            if (light == true) {
                return "The lantern is now on";
            } else {
                this.light = false;
                return "The lantern is now off";
            }
        } else {
            if (light == false) {
                return "The lantern is already off";
            } else {
                this.light = true;
                return "The lantern is now on.";
            }

        }
    }
}
