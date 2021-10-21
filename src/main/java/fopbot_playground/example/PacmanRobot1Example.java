package fopbot_playground.example;

import fopbot.World;

import static fopbot.Direction.LEFT;
import static fopbot.Direction.RIGHT;
import static fopbot.Direction.UP;

public class PacmanRobot1Example {
  public static void main(String[] args) {
    World.setSize(14, 14);
    World.setVisible(true);
    for (int i = 0; i < 14; i++) {
      for (int j = 0; j < 14; j++) {
        World.putCoins(i, j, 1);
      }
    }

    PacmanRobot1 paccy1 = new PacmanRobot1(1, 0, RIGHT);
    PacmanRobot1 paccy2 = new PacmanRobot1(9, 0, UP);
    PacmanRobot1 paccy3 = new PacmanRobot1(12, 11, LEFT);

    for (int i = 0; i < 9; i++) {
      paccy1.huntCoinsOneStep();
      paccy2.huntCoinsOneStep();
      paccy3.huntCoinsOneStep();
    }
  }
}
