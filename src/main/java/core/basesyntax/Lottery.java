package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setRandomColor(ball.getRandomColor());
        ball.setRandomNumber(new Random().nextInt(101));
        return ball;
    }
}
