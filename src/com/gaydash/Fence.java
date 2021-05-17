package com.gaydash;

public class Fence extends Unit {

    public Fence(int x, int y) {
        super(x, y);
    }

    public void destroy() {
        System.out.println("I was destroyed");
    }

}
