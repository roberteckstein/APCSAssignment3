package com.shs.creature;

import com.shs.CreatureTemplate;
import com.shs.ItemTemplate;

public class Gatekeeper extends CreatureTemplate {

    public Gatekeeper() {
        super("madman", "A madman stands at the gate with an assortment of wild clothing strewn across the floor. He walks up to you and asks for your hat in order to cross.");
    }

    @Override
    public String use(ItemTemplate target)
    {
        if (target.getName().equals("fedora")&&isAlive())
        {
            setAlive(false);
            return "He takes the fedora, finally completing his outfit. He walks back towards the gate, unlocking the dungeon below while muttering about the devil.";
        }
        return "";
    }

    @Override
    public String getDescription()
    {
        if (isAlive())
        {
            return "A madman stands at the gate with an assortment of wild clothing strewn across the floor. He walks up to you and asks for your hat in order to cross.";
        }
        return "The mad man sifts through his clothes at the entrance of the gate trying on new outfits.";
    }
}

