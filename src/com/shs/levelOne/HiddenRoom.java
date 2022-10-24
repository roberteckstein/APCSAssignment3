package com.shs.levelOne;

public class HiddenRoom extends RoomTemplate{
    public HiddenRoom() {   // Why is there a '...' after String?


        this.shortDescription = "you've made it, to the hidden room";
        this.alreadyVisited = false;   // By default, all rooms are set to not have been visited yet


        for (String d : description) {
            this.description += d;
        }
    }
}
