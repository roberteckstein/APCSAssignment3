package com.shs.item;

import com.shs.ContainerTemplate;
import com.shs.traits.Openable;

public class CrystalPouch extends ContainerTemplate {

    boolean open = false;

    public CrystalPouch() {
        super("A crystal pouch.", "An ordinary looking pouch.", "You have a pouch with" + null + "crystals inside.");
    }

    @Override
    public boolean isGettable() {
        return true;
    }
    @Override
    public boolean isOpenable() {
        return true;
    }

}
