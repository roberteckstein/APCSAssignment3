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

    //defaults equipped description to the same as the main one, mostly for items that don't need to be equipped.
    public ItemTemplate(String name, String description) {
        this.name = name;
        this.description = description;
        this.equippedDescription = description;
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

    public String use(ItemTemplate item) { return ""; } //implement for particular items that can accept items (locks / monsters etc)
}