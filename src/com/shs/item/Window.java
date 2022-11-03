package com.shs.item;


import com.shs.RandomItemTemplate;

public class Window extends RandomItemTemplate {
    public Window () {
        super ("window", "", "How did you get this?");
        setDescription("There is a unopenable window on the wall. Behind the window is " + ranText(numGen(11)));

    }
    private String ranText (int x) {
        switch (x) {
            case 0:
                return "a grassy field. ";
            case 1:
                return "the interior of a cave. Crystals lie on the cave walls. ";
            case 2:
                return "a large kitchen. ";
            case 3:
                return "the side of a cliff overlooking a forest. ";
            case 4:
                return "yourself, staring back at you. ";
            case 5:
                return "the inside of a volcano. ";
            case 6:
                return "the outer space - very, very close to the sun. ";
            case 7:
                return "the room, flipped upside down. ";
            case 8:
                return "your deepest fear - something words cannot describe. ";
            case 9:
                return "the firey pits of the underworld. ";
            default:
                return "a stone wall. ";
        }
    }
}
