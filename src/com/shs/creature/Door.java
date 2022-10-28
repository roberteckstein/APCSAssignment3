package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;

public class Door extends CreatureTemplate {
    public Door() {
        super("door", "A tall door, yoy notice some text scribed into it, \"The crystal is the key' it reads.\"");
    }

    @Override
    public String use(ItemTemplate target) {
        if (target.getName().equals("crystal") && isAlive()) {
            setAlive(false);
            return "The door swings open and you are blasted by a wave of heat. The passage is now open.";
        }
        return "";
    }
}
