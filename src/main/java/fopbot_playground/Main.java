package fopbot_playground;

import fopbot.Robot;
import fopbot.World;

public class Main {
  public static void main(String[] args) {
    World.setSize(10, 10);
    World.setVisible(true);
    Robot robot = new Robot(0, 0);
    robot.move();
  }
}
