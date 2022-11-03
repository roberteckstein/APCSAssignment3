package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.traits.Lightable;

public class Sunball extends ItemTemplate implements Lightable {

    boolean light = false;
    public Sunball() {
        super("sunball", "A ball embodying the essence of the sun. It's very bright.", "A sunball");
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

    public String setLightable(boolean light) {
        if (this.light == true) {
            if (light == true) {
                return "The sunball is already on.";
            } else {
                this.light = false;
                return "The sunball is now off.";
            }
        } else {
            if (light == false) {
                return "The sunball is already off.";
            } else {
                this.light = true;
                return "The sunball is now on.";
            }

        }
    }
}
