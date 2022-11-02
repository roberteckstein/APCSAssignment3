package com.shs.item;

import com.shs.ItemTemplate;

public class WrittenNote2 extends ItemTemplate {

    public WrittenNote2(){
        super("paper", "You see a single sheet of paper lying on the floor.", "A typed sheet of paper that says: \n\"What seems impossible may be true,\nDon't think too hard, just go ahead and do.\nPut everything in the box.\"");

    }
    public boolean isGettable() {
            return true;
        }

    public boolean isOpenable() {
        return false;
    }
}