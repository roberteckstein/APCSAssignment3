package com.shs.item;

import com.shs.ContainerTemplate;
import com.shs.ItemTemplate;
import com.shs.traits.Openable;

import java.util.HashMap;
import java.util.Map;

public class Box extends ContainerTemplate implements Openable {

    boolean open = true;

    public Box() {
        //  Descriptions can be blank because accessors are overridden below.
        super("box", "", "");
    }

    public String getDescription() {

        String r = "There is a box here on the floor. ";
        if (this.open) {
            r = r + getContents();
        }

        return r;
    }


    public String getEquippedDescription() {

        String r = "A box that is " + (open ? "open." : "closed.") + " ";
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
                return "The box is already open.";
            } else {
                this.open = false;
                return "The box is now closed.";
            }
        } else {
            if (open == false) {
                return "The box is already closed.";
            } else {
                this.open = true;
                return "The box is now open.";
            }

        }
    }
}