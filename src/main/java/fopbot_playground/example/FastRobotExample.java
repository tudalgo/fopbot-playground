package fopbot_playground.example;

import fopbot.World;

import static fopbot.Direction.UP;

public class FastRobotExample {
  public static void main(String[] args) {
    World.setVisible(true);
    FastRobot fr = new FastRobot(3, 4, UP, 0);
    fr.move();
    fr.turnLeft();
    fr.move(5);
  }
}
