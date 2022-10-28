package com.shs.levelThree;

import com.shs.TextAdventure;
import com.shs.RoomTemplate;
import com.shs.item.Graffiti;
import com.shs.item.Mattress;

import java.util.Random;

public class InfiniteRoom extends RoomTemplate {
    public InfiniteRoom () {
        super("This room looks familiar to you.","");
        
        System.gc(); // Calls Garbage Collecter due to the excess of unused objects being created.
        
        setDescription("You are in a bedroom with doors North, West, East, South" + ranNoise(numGen(10)));
        setMoveErrorMessage("There may be many exits to this room, but that is not one of them.");
        
        // Adding Objects based on random number generator
        addItem(new Graffiti(ranColor(numGen(12))));
        if (numGen(10) > 4) {
            addItem(new Mattress(ranColor(numGen(12))));
        }
        
        // Adding paths to room. New instances of same InfiniteRoom Class
        addPath("north", new InfiniteRoom());
        addPath("south", new InfiniteRoom());
        addPath("east", new InfiniteRoom());
        addPath("west", new InfiniteRoom());
    }
    
    // Random Number Generator Method for reusabiity
    private int numGen (int high) {
        Random r = new Random();
        int x = r.nextInt(high);
        return(x);
    }
    
    // Random Noise Text Description to mess with user
    private String ranNoise (int x){
        String y  = "You hear a noise coming from the";
        switch (x) {
            case 0 : return (y + " North. ");
            case 1 : return (y + " South. ");
            case 2 : return (y + " East. ");
            case 3 : return (y + " West. ");
            default : return "";
        }
    }
    
    // Random Color Stuff
    private String ranColor (int x){
        switch (x) {
            case 0 : return "blue";
            case 1 : return "red";
            case 2 : return "purple";
            case 3 : return "orange";
            case 4 : return "green";
            case 5 : return "yellow";
            case 6 : return "pink";
            case 7 : return "grey";
            case 8 : return "white";
            case 9 : return "black";
            case 10 : return "tan";
            case 11 : return "teal";
            default : return "clear";
        }
    }
}
