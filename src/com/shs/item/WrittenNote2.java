package com.shs.item;

import com.shs.ItemTemplate;
import com.shs.TextAdventure;

public class WrittenNote2 extends ItemTemplate {

    public WrittenNote2(){
        super("paper", "", "");

    }
    public boolean isGettable() {
            return false;
        }

    public boolean isOpenable() {
        return false;
    }

    @Override
    public String getDescription() {
        if (TextAdventure.currentRoom.getItem("box") != null) {
            this.setDescription("Looking closer, ");
        }
        return "You see a single sheet of paper taped to the wall, high out of reach. It says: \n\"What seems impossible may be true,\nDon't think too hard, just go ahead and do.\n...\nPut everything in the box.\"\n";
    }

}