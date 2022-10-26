package com.shs.item;

import com.shs.ItemTemplate;
import java.util.Random;
public class Graffiti extends ItemTemplate {
    public Graffiti (String color) {
        super ("graffiti","", " How did you get this?");
       setDescription("There is" + color + " graffiti on the wall. It reads \"" + ranRiddle(numGen(11))+ "\" ");
    }
    private int numGen (int high) {
        Random r = new Random();
        int x = r.nextInt(high);
        return(x);
    }
    private String ranRiddle (int x) {
        switch (x) {
            case 0 : return "We are everywhere. There are 600 million of us watching your every move.";
            case 1 : return "Macska. Isn't that purfect?";
            case 2 : return "Man's friend?";
            case 3 : return "I love my sleep. Don't wake me up or suffer a nasty surprise.";
            case 4 : return "Jon, feed me my lasagna.";
            case 5 : return "You are all like mice to me.";
            case 6 : return "I can smell you.";
            case 7 : return "Even Otters Want Mothers.";
            case 8 : return "I wonder what the answer is? (Type it in whenever you've figured it out)";
            case 9 : return "Once upon a time, I was one of the most feared things around.";
            case 10 : return "Elegance, Curiosity, Independence, Protection, and Magic.";
            default : return "It broke.";
        }
    }
}