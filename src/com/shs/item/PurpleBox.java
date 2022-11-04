package com.shs.item;

import com.shs.ContainerTemplate;
import com.shs.traits.Openable;

public class PurpleBox extends ContainerTemplate implements Openable {

    boolean open = false;

    public PurpleBox() {
        //  Descriptions can be blank because accessors are overridden below.
        super("box", "", "");
    }

    public String hasShapes() {
        if (containedItems.checkInventory("cube") && (containedItems.checkInventory("sphere")) && (containedItems.size() == 2)) {
            System.out.println("\n\nThe silhouette of a door suddenly glows bright purple in the northeast face of the room, opening to reveal a passage.");

        }
        return "";
    }

    public String getDescription() {

        String r = "A purple box that is " + (open ? "open." : "closed.") + " ";
        if (this.open) {
            r = r + getContents();
        }

        return r;
    }


    public String getEquippedDescription() {

        String r = "A purple box that is " + (open ? "open." : "closed.") + " ";
        if (this.open) {
            r = r + getContents();
        }

        return r;
    }


    @Override
    public boolean isGettable() {
        return false;
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

    public String getContents() {

        String r = "";

        if (containedItems.size() > 0) {
            r = r + "Inside is the following: \n" + containedItems.printItems();
        } else {
            r = r + "There is nothing inside.";
        }


        return r;
    }
}