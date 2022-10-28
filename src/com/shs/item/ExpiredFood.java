package com.shs.item;

import com.shs.ItemTemplate;

public class ExpiredFood extends ItemTemplate {
    public ExpiredFood(){
        super("food", "some expired food", "Rations... From 1996... Ew.");

    }
    public boolean isGettable() {
            return true;
        }
}

