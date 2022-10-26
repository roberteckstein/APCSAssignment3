package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;

public class Doggo extends CreatureTemplate {

    public Doggo() {
            super("Dog", "There is a hungry looking dog, he won't let you in");
        }
        @Override
        public String use(ItemTemplate target) {
            if (target.getName().equals("food")&&isAlive())
            {
                setAlive(false);
                return "The dog grabs the expired food and runs past you, towards the exit.";
            }
            return "";
        }
    }


