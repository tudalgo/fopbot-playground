package fopbot_playground.example;

import fopbot.Direction;

public class FastRobot extends SymmTurner {
  public FastRobot(int street, int avenue, Direction direction, int beepers) {
    super(street, avenue, direction, beepers);
  }

  public void move(int numberOfSteps) {
    for (int i = 0; i < numberOfSteps; i++) {
      move();
    }
  }
}
