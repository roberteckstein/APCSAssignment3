package com.shs.item;

import com.shs.ItemTemplate;

public class WrittenNote extends ItemTemplate {

    public WrittenNote(){
        super("note", "You see a scribbled note tacked to the wall.", "Complaint form 162    The entrace is such a tripping hazard, only yesterday i triped over a loose stone and almost fell on my pick, I tried to brace myself but it didn't work, it was like the wall wasn't there! must have been farther away than I thought.");

    }
    public boolean isGettable() {
            return true;
        }
}



