package com.shs;

import com.shs.item.*;
import com.shs.monster.Dragon;
import com.shs.monster.Monster;
import com.shs.room.Cavern;
import com.shs.room.Room;
import com.shs.room.Tomb;
import com.shs.traits.Openable;

import java.util.HashMap;
import java.util.Scanner;

public class TextAdventure {

    private boolean gameOver = false;

    private Inventory playerInventory;

    //  Static so they can be referenced from anywhere
    public static Room currentRoom;
    public static Room cavern, tomb;
    public static Item sword, chest;
    public static Monster dragon;

    public void setup() {

        playerInventory = new Inventory();

        //  Must create items before populating rooms
        sword = new Sword();
        dragon = new Dragon();
        chest = new Chest();

        //  Must create rooms before creating paths
        cavern = new Cavern();
        tomb = new Tomb();

        //  Add paths from one room to the next
        cavern.addPath("north", tomb);
        tomb.addPath("south", cavern);

        currentRoom = cavern;

    }

    public void run() {

        Scanner in = new Scanner(System.in);

        System.out.println(currentRoom.getLongDescription());
        currentRoom.setAlreadyVisited(true);

        while (!gameOver) {
            System.out.print("> ");
            String message = parse(in.nextLine().trim());
            System.out.println(message);
        }

        in.close();

    }

    public String parse(String command) {

        command = command.replaceAll("( a | the | in | from )", " ");

        String[] parts = command.split(" ", 3);
        String action = "", target = "", directObject = "";

        if (parts.length == 1) {
            action = command;
        } else if (parts.length == 2) {
            action = parts[0];
            target = parts[1];
        } else if (parts.length == 3) {
            action = parts[0];
            target = parts[1];
            directObject = parts[2];
        }

        if (action.equals("move") || action.equals("go")) {
            return move(target);
        } else if (action.equals("get") || action.equals("take")) {
            return get(target);
        } else if (action.equals("put")) {
            return put(target, directObject);
        } else if (action.equals("remove")) {
            return remove(target, directObject);
        } else if (action.equals("drop")) {
            return drop(target);
        } else if (action.equals("open")) {
            return open(target);
        } else if (action.equals("close")) {
            return close(target);
        } else if (action.equals("quit")) {
            gameOver = true;
            return "Quitting the game";
        } else if (action.equals("inventory")) {
            return inventory();
        } else if (action.equals("look")) {
            return currentRoom.getLongDescription();
        }

        return "Unknown command: " + command;
    }

    public String move(String direction) {

        Room nextRoom = currentRoom.getRoomAt(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            if (currentRoom.isAlreadyVisited()) {
                return currentRoom.getShortDescription();
            } else {
                return currentRoom.getLongDescription();
            }
        } else {
            return currentRoom.getMoveErrorMessage();
        }
    }

    public String get(String target) {

        Item i = currentRoom.removeItem(target);
        if (i == null) {
            return "You cannot find that item.";
        } else if (!i.isGettable()) {
            return "You cannot get that item.";
        } else {
            playerInventory.addItem(i);
            return "Taken.";
        }

    }

    public String drop(String target) {

        Item i = playerInventory.removeItem(target);
        if (i != null) {
            currentRoom.addItem(i);
            return "Dropped.";
        } else {
            return "You are not carrying that item.";
        }
    }

    public String put(String target, String directObject) {

        //  Check both the room and the player's inventory
        Item i = currentRoom.getItem(target);
        Item d = currentRoom.getItem(directObject);

        if (i == null) {
            i = playerInventory.getItem(target);
        }

        if (d == null) {
            d = playerInventory.getItem(directObject);
        }

        if (i == null) {
            return "You do not see the " + target + ".";
        } else if (d == null) {
            return "You do not see the " + directObject + ".";
        } else if (!(d instanceof ContainerItem)) {
            return "You cannot put the " + target +
                    " inside of the " + directObject;
        } else {

            ContainerItem ci = (ContainerItem)d;

            if ((ci instanceof Openable) && (!((Openable)ci).isOpen())) {
                return "The " + directObject + " is not open.";
            }

            ci.containedItems.addItem(i);
            currentRoom.removeItem(target);
            playerInventory.removeItem(target);
            return "Done.";

        }
    }

    public String remove(String target, String directObject) {

        //  Check both the room and the player's inventory
        Item d = currentRoom.getItem(directObject);

        if (d == null) {
            d = playerInventory.getItem(directObject);
        }

        if (d == null) {
            return "You do not see the " + directObject + ".";
        } else if (!(d instanceof ContainerItem)) {
            return "The " + directObject + " does not contain anything.";
        } else {

            ContainerItem ci = (ContainerItem)d;

            if ((ci instanceof Openable) && (!((Openable)ci).isOpen())) {
                return "The " + directObject + " is not open.";
            }

            Item i = ci.containedItems.getItem(target);
            if (i == null) {
                return "The " + target + " is not inside the " + directObject + ".";
            }

            ci.containedItems.removeItem(target);
            currentRoom.addItem(i);
            return "The " + target + " is now on the ground.";

        }
    }

    public String open(String target) {

        //  Check both the room and the player's inventory
        Item i = currentRoom.getItem(target);
        if (i == null) {
            i = playerInventory.getItem(target);
        }

        if (i == null) {
            return "You do not see that item.";
        } else if (!(i instanceof Openable)) {
            return "You cannot open that item.";
        } else {
            ((Openable)i).setOpen(true);
            return "Opened.";
        }
    }

    public String close(String target) {

        //  Check both the room and the player's inventory
        Item i = currentRoom.getItem(target);
        if (i == null) {
            i = playerInventory.getItem(target);
        }

        if (i == null) {
            return "You do not see that item.";
        } else if (!(i instanceof Openable)) {
            return "You cannot close that item.";
        } else {
            ((Openable)i).setOpen(false);
            return "Closed.";
        }
    }

    public String inventory() {

        String returnValue = "You have the following items:\n";
        returnValue += playerInventory.printItems();

        return returnValue;
    }

    public static void main(String[] args) {
        TextAdventure game = new TextAdventure();
        game.setup();
        game.run();
    }
}
