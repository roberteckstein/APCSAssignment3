package com.shs.levelOne;

import com.shs.ItemTemplate;

public class WrittenNote extends ItemTemplate {

    public WrittenNote(){
        super("note", "a note with small writing, you'd have to be holding it close to read it", "Complaint form 162    The entrace is such a tripping hazard, only yesterday i triped over a loose stone and almost fell on my pick, I tried to brace myself but it didn't work, it was like the wall wasn't there! must have been farther away than I thought.");

    }
    public boolean isGettable() {
            return true;
        }
}



