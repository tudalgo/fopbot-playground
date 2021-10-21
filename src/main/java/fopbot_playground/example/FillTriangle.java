package fopbot_playground.example;

import fopbot.Robot;
import fopbot.World;

import static fopbot.Direction.RIGHT;

public class FillTriangle {
  public static void main(String[] args) {
    World.setSize(12, 10);
    World.setVisible(true);
    Robot rex = new Robot(1, 0, RIGHT, 90);
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < i; j++) {
        rex.putCoin();
        rex.move();
      }
      rex.turnLeft();
      rex.move();
      rex.turnLeft();
      for (int k = 0; k < i; k++) {
        rex.move();
      }
      rex.turnLeft();
      rex.turnLeft();
    }
  }
}
