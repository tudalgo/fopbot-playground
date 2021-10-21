package fopbot_playground.example;

import fopbot.World;

import static fopbot.Direction.RIGHT;

public class PacmanRobotExample {
  public static void main(String[] args) {
    World.setSize(14, 14);
    World.setVisible(true);
    for (int i = 0; i < 14; i++) {
      for (int j = 0; j < 14; j++) {
        World.putCoins(i, j, 1);
      }
    }

    PacmanStrategy ps1 = new PacmanStrategy1();
    PacmanStrategy ps2 = new PacmanStrategy2();

    PacmanRobot pr1 = new PacmanRobot(1, 0, RIGHT, ps1);
    PacmanRobot pr2 = new PacmanRobot(3, 0, RIGHT, ps2);

    for (int i = 0; i < 9; i++) {
      pr1.huntCoinsOneStep();
      pr2.huntCoinsOneStep();
    }
  }
}
