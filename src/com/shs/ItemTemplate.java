package com.shs;

public abstract class ItemTemplate extends Object{

    private final String name;
    private final String description;
    private final String equippedDescription;


    public ItemTemplate(String name, String description, String equippedDescription) {
        this.name = name;
        this.description = description;
        this.equippedDescription = equippedDescription;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getEquippedDescription() {
        return equippedDescription;
    }

    public boolean isMoveable() {
        return false;
    }
    public boolean isGettable() {
        return false;
    }
    public boolean isOpenable() { return false; }

}