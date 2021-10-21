package fopbot_playground.example;

import fopbot.Direction;
import fopbot.Robot;

public class SymmTurner extends Robot {
  public SymmTurner(int x, int y, Direction direction, int numberOfCoins) {
    super(x, y, direction, numberOfCoins);
  }

  public void turnRight() {
    for (int i = 0; i < 3; i++) {
      turnLeft();
    }
  }
}
