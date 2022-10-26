package com.shs;


/* IMPORTS
When new rooms, items, or other classes are created, remember to add import statements here
 */
import com.shs.item.*;
import com.shs.creature.*;
import com.shs.levelOne.*;
import com.shs.levelTwo.EntryRoom2;
import com.shs.traits.*;


import java.util.Scanner;






/* MAIN CLASS
Controls the game by calling all other various room and items classes

Remember guys, since we'll all be working on different pieces of code IntelliJ lets you collapse blocks of code
that you aren't working on at the moment, which can help readability (click the little arrowed-tabs directly to
the left next to the line numbers).
 */
public class TextAdventure {





    // Ends the game when true (exit code 0)
    private boolean gameOver = false;


    // playerInventory is an instance of the imported class Inventory, which is a hashmap.
    private Inventory playerInventory;


    //  Static so they can be referenced from anywhere
    //  Every object in the game must be listed here
    public static RoomTemplate currentRoom;
    public static RoomTemplate startingRoom, roomSecond, hiddenRoom, entryRoom2;





    // GAME CONFIGURATION. Work in this block to change map layout, room contents, or item/room instances
    public void setup() {


        // Creates a new instance of the Inventory class
        playerInventory = new Inventory();


        /*  Must create items before populating rooms. Creates a new instance of each item class. Multiple instances
        of the same class must have unique names (shortSword vs. longSword or swordStartingRoom vs. swordCavern)
         */


        /*  Must create rooms before creating paths. Creates a new instance of each room class.
        If we want to create multiple instances of the same room template, that can be done simply by declaring two
        rooms with different names (cavernIcy and cavernDark)
         */
        startingRoom = new EntryRoom1();
        roomSecond = new RoomSecond();
        hiddenRoom = new HiddenRoom();

        //Level 2 room instantiation
        entryRoom2 = new EntryRoom2();


        /*  Add paths from one room to the next. The template class 'RoomTemplate' (that all room instances inherit) has
        a hashmap called 'exits' where the key is the direction to go in (north, south, etc.) and the value is the room
        that direction leads to.

        So in the example cavern1.addPath("north",cavern2'), 'cavern1' is the room we're adding a connection to, 'north'
        is the keyword (direction) invoked to go to a new room, and 'cavern2' is the connecting room we end up in.
        Adding the opposite 'cavern2.addPath("south",cavern1)' creates a two-way connection between one. ALL PATHS
        NEED BOTH LINES OF CODE TO GO BACK AND FORTH, else it's a one-way path

        The whole block of code here is just for setting up the map, so we can mess with it to change the map
        on the fly.
         */

        //LEVEL ONE rooms
        startingRoom.addPath("north", roomSecond);
        startingRoom.addPath("west", hiddenRoom);
        roomSecond.addPath("south", startingRoom);

        //LEVEL TWO rooms



        //LEVEL THREE rooms
        // This sets which room you start in when the game starts.
        currentRoom = startingRoom;

    }   // End GAME CONFIGURATION block




    // GAME EXECUTION. For now, do not touch
    public void run() {


        // Creates a scanner called 'in' to take user input
        Scanner in = new Scanner(System.in);


        /* This fetches and prints a description of the current room (stored in that room's class file), and notes
        that the user has now visited that room
         */
        System.out.println(currentRoom.getLongDescription());
        currentRoom.setAlreadyVisited(true);


        // This loops until the game ends, to constantly read commands the user inputs
        while (!gameOver) {
            System.out.print("> ");
            String message = parse(in.nextLine().trim());
            System.out.println(message);
        }


        // Closes the scanner, and the game ends (exit code 0)
        in.close();

    }   // End GAME EXECUTION block





    // READ AND EXECUTE USER INPUT
    public String parse(String command) {


        // This takes all unimportant words out of the user's input and replaces them with a space character
        command = command.replaceAll("( a | the | in | from )", " ");


        /* This splits up the user's input by where the spaces are, to a maximum of 3 different parts. NOTE: CURRENT
        IMPLEMENTATION MEANS ALL USER INPUT MUST FOLLOW THE SAME 'action, target, _____' PATTERN (swing the sword at
        the dragon).

        This also creates an array, called parts, that stores each distinct part of the user's input as a distinct
        element (to a maximum of 3).
         */
        String[] parts = command.split(" ", 3);
        String action = "", target = "", directObject = "";


        /* If the input was a single action like 'walk', then action is set to the command.
           If the input was an action and a target like 'swing the sword', then action is set to the first part
           of the array, and target is set to the second part of the array.
           The same is true for a three-part command like 'take the sword from the stone', where directObject is the
           third part of the command and the third element in the 'parts' array.
         */
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


        // Big ol' if/else structure for each possible action.
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

        } else if (action.equals("use") || action.equals("give"))
        {
            return use(target, directObject);
        }

        return "Unknown command: \"" + command + "\"";
    } // End READ AND EXECUTE USER INPUT block



    /* MOVEMENT BETWEEN ROOMS
    In its current form, being in a room means the user can access everything in that room.
    If we want to make a very large room (or very long one) where not everything is accessible at the same time,
    that room can be split into multiple room instances.
     */
    public String move(String direction) {

        RoomTemplate nextRoom = currentRoom.getRoomAt(direction);
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
    }   // End MOVEMENT BETWEEN ROOMS block





    /* PICK UP ITEM
    If the item isn't null, and is gettable, the item is added to the playerInventory hashmap
     */
    public String get(String target) {

        ItemTemplate i = currentRoom.getItem(target);
        if (i == null) {
            return "You cannot find that item.";
        } else if (!i.isGettable()) {
            return "You cannot get that item.";
        } else {
            playerInventory.addItem(i);
            currentRoom.removeItem(target);
            return "Taken.";
        }

    }   // End PICK UP ITEM block





    /* DROP ITEM
    If the item is in playerInventory and isn't null, it is removed from playerInventory and added to the current room
     */
    public String drop(String target) {

        ItemTemplate i = playerInventory.removeItem(target);
        if (i != null) {
            currentRoom.addItem(i);
            return "Dropped.";
        } else {
            return "You are not carrying that item.";
        }
    }   // End DROP ITEM block





    /* PUT ITEM
    Puts a "target" object inside of a "directObject" container (e.g., "put sword in chest"). First, ensure that
    both the object you're "putting" and the container object are either in the room, or in your inventory. If
    we cannot find either one, the command fails with an error message. Next, ensure that the directObject is
    in fact a container. Next, if the object is openable, be sure it is in fact open. Finally, if everything
    checks out, remove the object from the room or your inventory and place it in the container.
    */

    public String put(String target, String directObject) {


        //  Check both the room and the player's inventory
        ItemTemplate i = currentRoom.getItem(target);
        ItemTemplate d = currentRoom.getItem(directObject);


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
        } else if (!(d instanceof ContainerTemplate)) {
            return "You cannot put the " + target +
                    " inside of the " + directObject;
        } else {

            ContainerTemplate ci = (ContainerTemplate)d;


            if ((ci instanceof Openable) && (!((Openable)ci).isOpen())) {
                return "The " + directObject + " is not open.";
            }


            ci.containedItems.addItem(i);
            currentRoom.removeItem(target);
            playerInventory.removeItem(target);
            return "Done.";

        }
    }   // End PUT ITEM block





    /* REMOVE ITEM
    Removes a "target" object from a "directObject" container (e.g., "remove sword from chest"). First, ensure that
    the container object is in the room, or in your inventory. If we cannot find it, the command fails with an
    error message. Next, if the object is openable, be sure it is in fact open. Next, ensure that the directObject
    is a container and that the target open is in fact inside. Finally, if all of that checks out, remove the
    object from the container and put it on the ground.
     */
    public String remove(String target, String directObject) {

        //  Check both the room and the player's inventory
        ItemTemplate d = currentRoom.getItem(directObject);

        if (d == null) {
            d = playerInventory.getItem(directObject);
        }

        if (d == null) {
            return "You do not see the " + directObject + ".";
        } else if (!(d instanceof ContainerTemplate)) {
            return "The " + directObject + " does not contain anything.";
        } else {

            ContainerTemplate ci = (ContainerTemplate)d;

            if ((ci instanceof Openable) && (!((Openable)ci).isOpen())) {
                return "The " + directObject + " is not open.";
            }

            ItemTemplate i = ci.containedItems.getItem(target);
            if (i == null) {
                return "The " + target + " is not inside the " + directObject + ".";
            }

            ci.containedItems.removeItem(target);
            currentRoom.addItem(i);
            return "The " + target + " is now on the ground.";

        }
    }   // End REMOVE ITEM block





    /* OPEN OBJECT
    This method checks the room for the input target. If not found, it checks the player's inventory.
    Returns 1 of 3:
        Item not seen
        Item not openable
        Item opened
     */
    public String open(String target) {


        //  Perform room/inventory check for target
        ItemTemplate i = currentRoom.getItem(target);
        if (i == null) {
            i = playerInventory.getItem(target);
        }


        //  Return value
        if (i == null) {
            return "You do not see that item.";
        } else if (!(i instanceof Openable)) {
            return "You cannot open that item.";
        } else {
            ((Openable)i).setOpen(true);
            return "Opened.";
        }
    }   // End OPEN OBJECT check




    /* CLOSE OBJECT
    This method checks the room for the input target. If not found, it checks the player's inventory.
    Returns 1 of 3:
        Item not seen
        Item not closable
        Item closed
     */
    public String close(String target) {


        //  Perform room/inventory check for target
        ItemTemplate i = currentRoom.getItem(target);
        if (i == null) {
            i = playerInventory.getItem(target);
        }


        //  Return value
        if (i == null) {
            return "You do not see that item.";
        } else if (!(i instanceof Openable)) {
            return "You cannot close that item.";
        } else {
            ((Openable)i).setOpen(false);
            return "Closed.";
        }
    }   // End CLOSE OBJECT block





    /* PLAYER INVENTORY
    Method to print out the player's current inventory.
     */
    public String inventory() {

        String returnValue = "You have the following items:\n";
        returnValue += playerInventory.printItems();

        return returnValue;
    }   // End PLAYER INVENTORY block

    private String use(String target, String directObject) {
        ItemTemplate i = playerInventory.getItem(target);
        ItemTemplate d = currentRoom.getItem(directObject);


        if (d == null) {
            d = playerInventory.getItem(directObject);
        }

        if (i == null) {
            return "You do not see the " + target + ".";
        } else if (d == null) {
            return "You do not see the " + directObject + ".";
        }
        String result = d.use(i);
        if(!result.equals(""))
        {
            return result;
        }
        else {
            return "nothing happens";
        }
    }



    /* MAIN METHOD
    Creates a new instance of TextAdventure, calls 'setup' (configuration) and calls 'run' (execution)
     */
    public static void main(String[] args) {
        TextAdventure game = new TextAdventure();
        game.setup();
        game.run();
    }
}   // End MAIN METHOD block
