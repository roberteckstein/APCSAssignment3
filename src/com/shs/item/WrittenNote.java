package com.shs.item;

import com.shs.ItemTemplate;

public class WrittenNote extends ItemTemplate {

    public WrittenNote(){
        super("note", "You see a scribbled note tacked to the wall.", "Complaint form 162: \nThe entrance is such a tripping hazard, \njust yesterday I tripped over a loose stone and almost fell on my pick, I tried to brace myself but it didn't work, it was like the wall wasn't there! \nMust have been farther away than I thought.");

    }
    public boolean isGettable() {
            return true;
        }
}