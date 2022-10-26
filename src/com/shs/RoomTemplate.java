package com.shs;

import java.util.*;

public abstract class RoomTemplate {


    // Each room has a boolean for if it's already been visited or not.
    private boolean alreadyVisited;


    private String shortDescription;


    private String description = "";


    // Each room has a unique error message for trying to exit through an invalid path.
    private String moveErrorMessage = "";


    // A hashmap to list all valid exits from the room, and the room that they connect to.
    private HashMap<String, RoomTemplate> exits = new HashMap<String, RoomTemplate>();


    private Inventory itemsInRoom = new Inventory();




    public RoomTemplate(String shortDescription, String... description) {   // Why is there a '...' after String?


        this.shortDescription = shortDescription;
        this.alreadyVisited = false;   // By default, all rooms are set to not have been visited yet


        for (String d : description) {
            this.description += d;
        }
    }


    public void setDescription (String text) {
        description = text;
    }

    // Checks if the room has already been visited
    public boolean isAlreadyVisited() {
        return alreadyVisited;
    }


    // Sets alreadyVisited to true
    public void setAlreadyVisited(boolean alreadyVisited) {
        this.alreadyVisited = alreadyVisited;
    }


    // Prints a list of items in the room (short version)
    public String getShortDescription() {
        String returnValue = this.shortDescription;
        for (ItemTemplate item: itemsInRoom.getInventory()) {
            returnValue += "\n" + item.getDescription();
        }

        return returnValue;
    }


    // Prints a list of items in the room (long version)
    public String getLongDescription() {

        String returnValue = this.description;
        for (ItemTemplate item: itemsInRoom.getInventory()) {
            returnValue += "\n" + item.getDescription();
        }

        return returnValue;
    }


    // Adds an item to the room. Used for initial game layout configuration
    public void addItem(ItemTemplate item) {
        itemsInRoom.addItem(item);
    }



    public ItemTemplate getItem(String name) {
        return itemsInRoom.getItem(name);
    }



    public ItemTemplate removeItem(String name) {
        return itemsInRoom.removeItem(name);
    }


    /* Method for adding paths between rooms. First value is the keyword to access that room from the current room
    (like 'north'), and the second value is the room it gives access to.
     */
    public void addPath(String direction, RoomTemplate room) { exits.put(direction, room);}


    /* Method to remove paths between rooms.
     */
    public void removePath(String direction) { exits.remove(direction);}



    //  Override in subclass, return null, and set error message if some
    //  obstacle temporarily prevents user from taking path (i.e., closed door, etc.)
    public RoomTemplate getRoomAt(String direction) { return exits.get(direction);}



    public String getMoveErrorMessage() { return moveErrorMessage; }

    //used if you want to give a different error for different directions (such as a blocked exit)
    public String getMoveErrorMessage(String direction) { return getMoveErrorMessage(); }

    public String use(String i, String d) {return  "";}


    public void setMoveErrorMessage(String errorMessage) { moveErrorMessage = errorMessage; }


}