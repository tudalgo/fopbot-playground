package fopbot_playground.example;

import fopbot.Robot;
import fopbot.World;

import static fopbot.Direction.RIGHT;

public class Chess {
  public static void main(String[] args) {
    World.setVisible(true);
    Robot chess = new Robot(1, 0, RIGHT, 32);
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 8; j++) {
        if ((chess.getX() + chess.getY()) % 2 == 0) {
          chess.putCoin();
        }
        chess.move();
      }
      chess.turnLeft();
      chess.move();
      chess.turnLeft();
      chess.move();
      for (int k = 0; k < 8; k++) {
        if ((chess.getX() + chess.getY()) % 2 == 0) {
          chess.putCoin();
        }
        chess.move();
      }
      chess.turnLeft();
      chess.turnLeft();
      chess.turnLeft();
      chess.move();
      chess.turnLeft();
      chess.turnLeft();
      chess.turnLeft();
      chess.move();
    }
  }
}
