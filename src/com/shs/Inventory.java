package com.shs;

import com.shs.item.Item;

import java.util.*;

public class Inventory {

    private Map<String, Item> inventory = new HashMap<String, Item>();

    public int size() { return inventory.size();}
    public Collection<Item> getInventory() {
        return inventory.values();
    }
    public void addItem(Item item) {
        inventory.put(item.getName(), item);
    }
    public Item getItem(String itemName) {
        return inventory.get(itemName);
    }
    public Item removeItem(String itemName) {
        return inventory.remove(itemName);
    }

    public String printItems() {

        String r = new String();
        for (Item i : getInventory()) {
            r += i.getEquippedDescription() + "\n";
        }
        return r;
    }
}
