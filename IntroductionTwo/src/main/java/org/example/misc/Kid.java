package org.example.misc;

public class Kid {

    private final String name;

    public Kid(String name) {
        this.name = name;
    }

    public void kick(BallInterface ball){
        System.out.println("Kicked ball: " + ball.getName());
    }

}
