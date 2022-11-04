package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;
import com.shs.TextAdventure;

public class Door extends CreatureTemplate {
    public Door() {
        super("wall", "A tall door, you notice some text etched into it, \"The crystal is the key' it reads.\"");
    }

    @Override
    public String use(ItemTemplate target) {
        if (target.getName().equals("crystal") && isAlive()) {
            setAlive(false);
            TextAdventure.playerInventory.removeItem("crystal");
            return "You hear a click and the door swings open! You are blasted by a wave of heat. The passage north is now open.";
        }
        return "";
    }
}
