package org.example;

import java.util.*;

public class Over {
    private final List<Ball> overBalls = new ArrayList<>();

    Over(Ball[] ballArray) {
        overBalls.addAll(Arrays.asList(ballArray));
    }

    public void addToOver(Ball ball) {
       overBalls.add(ball);
    }

    public void removeFromOver(Ball ball) {
        overBalls.remove(ball);
    }

    public List<Ball> getOverBalls() {
        return overBalls;
    }
}
