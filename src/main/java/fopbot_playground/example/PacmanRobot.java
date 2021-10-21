package fopbot_playground.example;

import fopbot.Direction;

public class PacmanRobot extends SymmTurner {
  private final PacmanStrategy strategy;

  public PacmanRobot(int x, int y, Direction direction, PacmanStrategy theStrategy) {
    super(x, y, direction, 0);
    strategy = theStrategy;
  }

  private void pickAllCoins() {
    while (isNextToACoin()) {
      pickCoin();
    }
  }

  public void huntCoinsOneStep() {
    move();
    pickAllCoins();
    int numberOfLeftTurns = strategy.numberOfLeftTurns();
    for (int i = 0; i < numberOfLeftTurns; i++) {
      turnLeft();
    }
  }
}
