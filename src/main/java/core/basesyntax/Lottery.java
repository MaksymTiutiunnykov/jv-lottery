package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAXIMUM_BALL_NUMBER = 101;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setRandomColor(colorSupplier.getRandomColor());
        ball.setRandomNumber(new Random().nextInt(MAXIMUM_BALL_NUMBER));
        return ball;
    }
}
