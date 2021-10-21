package fopbot_playground.example;

import fopbot.Direction;

public class PacmanRobot2 extends SymmTurner {
  private boolean nextTurnLeft;
  private boolean itsTheFirstStep;

  public PacmanRobot2(int x, int y, Direction direction) {
    super(x, y, direction, 0);
    nextTurnLeft = true;
    itsTheFirstStep = true;
  }

  private void pickAllCoins() {
    while (isNextToACoin()) {
      pickCoin();
    }
  }

  public void huntCoinsOneStep() {
    move();
    pickAllCoins();
    if (itsTheFirstStep) {
      if (nextTurnLeft) {
        turnLeft();
      } else {
        turnRight();
      }
      nextTurnLeft = !nextTurnLeft;
    }
    itsTheFirstStep = !itsTheFirstStep;
  }
}
