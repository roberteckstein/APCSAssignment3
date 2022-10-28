package com.shs.item;

import com.shs.ItemTemplate;

public class WrittenNote extends ItemTemplate {

    public WrittenNote(){
        super("note", "a note with small writing", "Complaint form 162    The entrance is such a tripping hazard, just yesterday i tripped over a loose stone and almost fell on my pick, I tried to brace myself but it didn't work, it was like the wall wasn't there! must have been farther away than I thought.");

    }
    public boolean isGettable() {
            return true;
        }
}