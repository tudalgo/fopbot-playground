package fopbot_playground.example;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

public class FirstSteps {
  public static void main(String[] args) {
    World.setSize(10, 10);
    World.setVisible(true);

    Robot alice = new Robot(4, 4, Direction.RIGHT, 3);
    alice.move();
    alice.move();
    alice.turnLeft();
    alice.move();
    alice.putCoin();
    alice.move();
    alice.move();
    alice.putCoin();
    alice.putCoin();
    alice.turnLeft();
    alice.move();
    alice.move();
    alice.pickCoin();
    alice.move();
  }
}
