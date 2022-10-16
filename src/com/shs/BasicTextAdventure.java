package com.shs;

import java.util.Scanner;

public class BasicTextAdventure {

    private boolean gameOver = false;

    private Inventory playerInventory;
    private Room currentRoom;
    private Room room1, room2;
    private Item sword, dragon;

    public void setup() {

        playerInventory = new Inventory();

        sword = new Item("sword", "There is a tall, glowing sword lying in a pile of treasures.", "A glowing sword.");
        dragon = new Item("dragon", "A large, red dragon eyes you as you move about the room.", "You are somehow carrying a dragon.");
        room1 = new Room("You are in a wide cavern filled with odd trinkets. A chiseled tunnel travels north into the rock face.");
        room2 = new Room("This is an old tomb, with several coffins. There is a passage going south.");

        room1.addPath("north", room2);
        room2.addPath("south", room1);

        room1.addItem(sword);
        room2.addItem(dragon);

        currentRoom = room1;

    }

    public void run() {

        Scanner in = new Scanner(System.in);

        while (!gameOver) {
            System.out.println(currentRoom.getLongDescription());
            System.out.print("> ");
            String message = parse(in.nextLine().trim());
            System.out.println(message);
        }

        in.close();

    }

    public String parse(String command) {

        String[] parts = command.split(" ", 2);
        String action, target = "";

        if (parts.length == 1) {
            action = command;
        } else if (parts.length != 2) {
            return "Unknown command: " + command;
        } else {
            action = parts[0];
            target = parts[1];
        }

        if (action.equals("move") || action.equals("go")) {
            return move(target);
        } else if (action.equals("get") || action.equals("take")) {
            return get(target);
        } else if (action.equals("drop")) {
            return drop(target);
        } else if (action.equals("inventory")) {
            //. Second word doesn’t matter: inventory me
            return inventory();
        }
        // } else if (action.equals("interact")) {
        //     return interact(target);
        // }

        return "Unknown command: " + command;
    }

    public String move(String direction) {

        Room nextRoom = currentRoom.roomAtPath(direction);
        if (nextRoom != null) {
            currentRoom = nextRoom;
            return "Moving that direction.";
        } else {
            return "You cannot move that direction.";
        }
    }

    public String get(String target) {

        Item i = currentRoom.removeItem(target);
        if (i != null) {
            playerInventory.addItem(i);
            return "Taken.";
        } else {
            return "You cannot find that item.";
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


    public String inventory() {

        String returnValue = "You have the following items:\n";
        for (Item i : playerInventory.getInventory()) {
            returnValue += i.getName() + ": " + i.getEquippedDescription() + "\n";
        }
        return returnValue;
    }

    public static void main(String[] args) {
        BasicTextAdventure game = new BasicTextAdventure();
        game.setup();
        game.run();
    }
}