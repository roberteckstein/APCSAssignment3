package com.shs.item;

import com.shs.ContainerTemplate;
import com.shs.traits.Openable;

public class Doll extends ContainerTemplate implements Openable {

    boolean open = false;

    public Doll(String doll) {
        //  Descriptions can be blank because accessors are overridden below.
        super("doll", "A nesting doll", "A nesting doll");
    }

    public String getDescription() {

        String r = "There is a Russian nesting doll that is " + (open ? "open." : "closed.") + " ";
        if (this.open) {
            r = r + getContents();
        }

        return r;
    }


    public String getEquippedDescription() {

        String r = "A nesting doll that is " + (open ? "open." : "closed.") + " ";
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
                return "The doll is already open.";
            } else {
                this.open = false;
                return "The doll is now closed.";
            }
        } else {
            if (open == false) {
                return "The doll is already closed.";
            } else {
                this.open = true;
                return "The doll is now open.";
            }

        }
    }
}