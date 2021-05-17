package com.gaydash;

public class Tank extends ShootMoveUnit {
    public Tank(int x, int y) {
        super(x, y);
    }

    public void reload() {
        System.out.println("I'm better than solder, I can reload.");
    }

}
