package com.shs.item;

import com.shs.ContainerTemplate;
import com.shs.traits.Openable;
import com.shs.item.Toast;


public class Toaster extends ContainerTemplate{

    boolean open = true;

    Toast toast = new Toast();

    public Toaster() {
        //  Descriptions can be blank because accessors are overridden below.
        super("toaster", "", "");
    }

    public String getDescription() {
        String r = "There is a toaster attached to the table. ";
        if (containedItems.getItem("bread") != null) {
            r = "An orange glow emanates from the toaster as it cooks the bread...\n...\nFinally it dings, and your toast pops up.";
            containedItems.clearInventory();
            containedItems.addItem(toast);
            System.out.println(toast.getName());
        } else if (containedItems.getItem("bread") == null) {
            r = r + getContents();

        }
        return r;
    }


    @Override
    public boolean isGettable() {
        return false;
    }



    public boolean isOpenable() {
        return true;
    }


    public boolean isOpen() {
        return open;
    }


     public String setOpen(boolean open) {
        if (this.open == true) {
            if (open == true) {
                return "The toaster is already open.";
            } else {
                this.open = false;
                return "The toaster is already open.";
            }
        } else {
            if (open == false) {
                return "The toaster is already open.";
            } else {
                this.open = true;
                return "The toaster is already open.";
            }

        }
    }

    @Override
    public String getContents() {

        String r = "";

        if (containedItems.size() > 0) {
            r = r + "Inside is the following: \n" + containedItems.printItems();
        } else {
            r = r + "The toaster is empty.";
        }

        return r;
    }
}