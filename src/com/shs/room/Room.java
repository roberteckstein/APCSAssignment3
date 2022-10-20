package com.shs.room;

import com.shs.Inventory;
import com.shs.item.Item;

import java.util.*;

public class Room {

    private boolean alreadyVisited;
    private String shortDescription;
    private String description = "";
    private String moveErrorMessage = "";

    private HashMap<String, Room> exits = new HashMap<String, Room>();
    private Inventory itemsInRoom = new Inventory();

    public Room(String shortDescription, String... description) {

        this.shortDescription = shortDescription;
        this.alreadyVisited = false;

        for (String d : description) {
            this.description += d;
        }
    }

    public boolean isAlreadyVisited() {
        return alreadyVisited;
    }

    public void setAlreadyVisited(boolean alreadyVisited) {
        this.alreadyVisited = alreadyVisited;
    }

    public String getShortDescription() {
        String returnValue = this.shortDescription;
        for (Item item: itemsInRoom.getInventory()) {
            returnValue += "\n" + item.getDescription();
        }

        return returnValue;
    }
    public String getLongDescription() {

        String returnValue = this.description;
        for (Item item: itemsInRoom.getInventory()) {
            returnValue += "\n" + item.getDescription();
        }

        return returnValue;
    }

    public void addItem(Item item) {
        itemsInRoom.addItem(item);
    }
    public Item getItem(String name) {
        return itemsInRoom.getItem(name);
    }
    public Item removeItem(String name) {
        return itemsInRoom.removeItem(name);
    }

    public void addPath(String direction, Room room) { exits.put(direction, room);}
    public void removePath(String direction) { exits.remove(direction);}

    //  Override in subclass, return null, and set error message if some
    //  obstacle temporarily prevents user from taking path (i.e., closed door, etc.)
    public Room getRoomAt(String direction) { return exits.get(direction);}

    public String getMoveErrorMessage() { return moveErrorMessage; }
    public void setMoveErrorMessage(String errorMessage) { moveErrorMessage = errorMessage; }


}

