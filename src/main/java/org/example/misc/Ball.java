package org.example.misc;

public class Ball implements BallInterface {

    private final String name;

    public Ball(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
