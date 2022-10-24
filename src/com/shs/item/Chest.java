package com.shs.item;

import com.shs.traits.Openable;

public class Chest extends ContainerItem implements Openable {

    boolean open = false;

    public Chest() {
        //  Descriptions can be blank because accessors are overridden below.
        super("chest", "", "");
    }

    public String getDescription() {

        String r = "There is a chest here that is " + (open ? "open." : "closed.") + " ";
        if (this.open) {
            r = r + getContents();
        }

        return r;
    }

    public String getEquippedDescription() {

        String r = "A chest that is " + (open ? "open." : "closed.") + " ";
        if (this.open) {
            r = r + getContents();
        }

        return r;
    }

    @Override
    public boolean isGettable() {
        return true;
    }

    @Override
    public boolean isOpenable() {
        return true;
    }

    @Override
    public boolean isOpen() {
        return open;
    }

    @Override
    public String setOpen(boolean open) {
        if (this.open == true) {
            if (open == true) {
                return "The chest is already open.";
            } else {
                this.open = false;
                return "The chest is now closed.";
            }
        } else {
            if (open == false) {
                return "The chest is already closed.";
            } else {
                this.open = true;
                return "The chest is now open.";
            }

        }
    }
}