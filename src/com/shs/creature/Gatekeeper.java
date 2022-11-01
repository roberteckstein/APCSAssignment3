package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;

public class Gatekeeper extends CreatureTemplate {

    public Gatekeeper() {
        super("gatekeeper", "A madman stands at the gate with an assortment on wild clothing strewn across the floor he walks up and asks for your hat in order to cross");
    }

    @Override
    public String use(ItemTemplate target)
    {
        if (target.getName().equals("fedora")&&isAlive())
        {
            setAlive(false);
            return "He takes the fedora finally completing his look and walks back towards the gate unlocking the dungeon below.";
        }
        return "";
    }

    @Override
    public String getDescription()
    {
        if (isAlive())
        {
            return "The mad man blocks the entrance to the gate.";
        }
        return "The mad man sifts through his clothes at the entrance of the gate looking for the perfect outfit.";
    }
}

