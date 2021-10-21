package fopbot_playground.example;

import fopbot.Robot;
import fopbot.World;

import static fopbot.Direction.RIGHT;

public class ArithmeticOperations {
  public static void main(String[] args) {
    World.setVisible(true);
    Robot ari = new Robot(0, 0, RIGHT, 357);

    for (int i = 0; i < 3 - 5 + 6; i++) {
      ari.putCoin();
      ari.move();
    }
    ari.turnLeft();
    for (int i = 0; i < 2 * (1 + 3); i++) {
      ari.putCoin();
      ari.move();
    }
    ari.turnLeft();

    for (int i = 0; i < 2 + 7 / 3; i++) {
      ari.putCoin();
      ari.move();
    }
    ari.turnLeft();
    for (int i = 0; i < (15 - 4) % 3; i++) {
      ari.putCoin();
      ari.move();
    }
  }
}
