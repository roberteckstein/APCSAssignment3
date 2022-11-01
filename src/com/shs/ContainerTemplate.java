package com.shs;

public abstract class ContainerTemplate extends ItemTemplate {

    Inventory containedItems;

    public ContainerTemplate(String name, String unequippedDescription, String equippedDescription) {
        super(name, unequippedDescription, equippedDescription);

        containedItems = new Inventory();
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