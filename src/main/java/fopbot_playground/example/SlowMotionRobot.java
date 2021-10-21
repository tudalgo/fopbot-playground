package fopbot_playground.example;

import fopbot.Direction;

public class SlowMotionRobot extends SymmTurner {
  private final int delay;

  public SlowMotionRobot(int x, int y, Direction direction, int numberOfCoins, int theDelay) {
    super(x, y, direction, numberOfCoins);
    delay = theDelay;
  }

  public void move() {
    super.move();
    try {
      Thread.sleep(delay);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void turnLeft() {
    super.turnLeft();
    try {
      Thread.sleep(delay);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void turnRight() {
    super.turnRight();
    try {
      Thread.sleep(delay);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
