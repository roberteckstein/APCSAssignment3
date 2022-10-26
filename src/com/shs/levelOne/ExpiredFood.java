package com.shs.levelOne;

import com.shs.ItemTemplate;

public class ExpiredFood extends ItemTemplate {
    public ExpiredFood(){
        super("food", "some expired food", "Rations, eww");

    }
    public boolean isGettable() {
            return true;
        }
}

