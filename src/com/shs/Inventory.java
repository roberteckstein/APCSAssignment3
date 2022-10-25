package com.shs;

import java.util.*;


public class Inventory {


    // Creates the inventory hashmap
    private Map<String, ItemTemplate> inventory = new HashMap<String, ItemTemplate>();


    // Returns the size of the inventory
    public int size() { return inventory.size();}


    // Returns the contents of the inventory
    public Collection<ItemTemplate> getInventory() {
        return inventory.values();
    }


    // Adds an item to the inventory
    public void addItem(ItemTemplate item) {
        inventory.put(item.getName(), item);
    }


    // Retrieves the name of an item in the inventory (?)
    public ItemTemplate getItem(String itemName) {
        return inventory.get(itemName);
    }


    // Removes an item from the inventory
    public ItemTemplate removeItem(String itemName) {
        return inventory.remove(itemName);
    }


    // Prints the contents of the player's inventory
    public String printItems() {


        if (inventory.size() == 0) {
            return "[ No items ]";
        }
        String r = new String();

        /* For each item in the inventory, the description is retrieved and concatenated (added) to a string that
        then prints the whole list of the player's inventory.
         */
        for (ItemTemplate i : getInventory()) {
            r += "- " + i.getEquippedDescription() + "\n";
        }
        return r;
    }
}
