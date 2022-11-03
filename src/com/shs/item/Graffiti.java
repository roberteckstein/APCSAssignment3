package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.RandomItemTemplate;

import java.util.Random;
public class Graffiti extends RandomItemTemplate {
    public Graffiti (String color) {
        super ("graffiti","", " How did you get this?");
       setDescription("There is " + color + " graffiti on the wall. It reads \"" + ranRiddle(numGen(17))+ "\" ");
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
            case 7 : return "Mothers Eat Our Wishes.";
            case 8 : return "I wonder what the answer is? (Type it in whenever you've figured it out)";
            case 9 : return "Once upon a time, I was one of the most feared things around.";
            case 10 : return "Elegance, Curiosity, Independence, Protection, and Magic.";
            case 11 : return "3120 B.C. The war between us and the drooling barbarians was declared. We tied, but we like to think we won.";
            case 12 : return "Basket is our god... Wait. You spelled it wrong Felix!";
            case 13 : return "Seafood. Yummy. A nice tuna fillet would be nice right now.";
            case 14 : return "You're all like little mice to me!";
            case 15 : return "No luck? You might've seen my cousin yesterday.";
            case 16 : return "Hi! This isn't a hint. Just an Easter Egg. Derek was here. ";
            default : return "It broke.";
        }
    }
}
