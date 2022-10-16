package com.shs;

public class Item {

    private final String name;
    private final String unequippedDescription;
    private final String equippedDescription;


    public Item(String name, String unequippedDescription, String equippedDescription) {
        this.name = name;
        this.unequippedDescription = unequippedDescription;
        this.equippedDescription = equippedDescription;
    }


    public String getName() {
        return name;
    }

    public String getUnequippedDescription() {
        return unequippedDescription;
    }

    public String getEquippedDescription() {
        return equippedDescription;
    }

}