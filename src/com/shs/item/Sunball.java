package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.traits.Lightable;

public class Sunball extends ItemTemplate implements Lightable {

    boolean light = false;
    public Sunball() {
        super("Sunball", "This is a portable ball of sun", "The sunball is lighting up the room.");
    }

    @Override
    public boolean isMoveable() {
        return false;
    }

    @Override
    public boolean isGettable() {
        return true;
    }
    public boolean isLightable() { return true; }

    public String setLightability(boolean light) {
        if (this.light == true) {
            if (light == true) {
                return "The sunball is now on";
            } else {
                this.light = false;
                return "The sunball is now off";
            }
        } else {
            if (light == false) {
                return "The sunball is already off";
            } else {
                this.light = true;
                return "The sunball is now on.";
            }

        }
    }
}
