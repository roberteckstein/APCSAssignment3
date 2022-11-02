package com.shs.item;

import com.shs.ItemTemplate;

public class Mattress extends ItemTemplate {
    public Mattress(String color) {
        super("mattress", "There is a " + color + " mattress in the corner. It lacks a bed or pillow. ", "How did you get this?");
    }
}