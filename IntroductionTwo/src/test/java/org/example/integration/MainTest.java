package org.example.integration;

import org.example.misc.Ball;
import org.example.misc.Kid;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testKidCanKickBall(){
        Kid kid = new Kid("ABC");
        Ball ball = new Ball("Ball A");
        kid.kick(ball);
    }

}