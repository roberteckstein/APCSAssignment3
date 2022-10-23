package com.shs;

import com.shs.item.Item;

import java.util.*;


public class Inventory {


    // Creates the inventory hashmap
    private Map<String, Item> inventory = new HashMap<String, Item>();


    // Returns the size of the inventory
    public int size() { return inventory.size();}


    // Returns the contents of the inventory
    public Collection<Item> getInventory() {
        return inventory.values();
    }


    // Adds an item to the inventory
    public void addItem(Item item) {
        inventory.put(item.getName(), item);
    }


    // Retrieves the name of an item in the inventory (?)
    public Item getItem(String itemName) {
        return inventory.get(itemName);
    }


    // Removes an item from the inventory
    public Item removeItem(String itemName) {
        return inventory.remove(itemName);
    }


    // Prints the contents of the player's inventory
    public String printItems() {


        String r = new String();

        /* For each item in the inventory, the description is retrieved and concatenated (added) to a string that
        then prints the whole list of the player's inventory.
         */
        for (Item i : getInventory()) {
            r += i.getEquippedDescription() + "\n";
        }
        return r;
    }
}
