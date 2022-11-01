package com.shs;

import java.util.Random;

public abstract class RandomItemTemplate extends ItemTemplate{
    public RandomItemTemplate (String name,String description, String equippedDescription) {
        super(name, description, equippedDescription);
    }
    protected int numGen(int high) {
        Random r = new Random();
        int x = r.nextInt(high);
        return(x);
    }

}
