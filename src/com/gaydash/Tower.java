package com.gaydash;

public class Tower extends Unit {
    public Tower(int x, int y) {
        super(x, y);
    }

    public void immortal() {
        System.out.println("You can't destroyed it, tower is immortal!");
    }
}
