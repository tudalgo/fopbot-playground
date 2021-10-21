package fopbot_playground.example;

import fopbot.Robot;
import fopbot.World;

import static fopbot.Direction.DOWN;

public class FallbeispielFopbot {
  public static void main(String[] args) {
    World.setSize(16, 12);
    World.setVisible(true);

    for (int i = 0; i < 2; i++) {
      World.placeVerticalWall(6, 1 + i);
    }
    for (int i = 0; i < 6; i++) {
      World.placeVerticalWall(14, 1 + i);
    }
    for (int i = 0; i < 8; i++) {
      World.placeVerticalWall(0, 3 + i);
    }
    for (int i = 0; i < 2; i++) {
      World.placeVerticalWall(12, 7 + i);
    }
    for (int i = 0; i < 2; i++) {
      World.placeVerticalWall(6, 9 + i);
    }

    for (int i = 0; i < 6; i++) {
      World.placeHorizontalWall(1 + i, 2);
    }
    for (int i = 0; i < 6; i++) {
      World.placeHorizontalWall(1 + i, 10);
    }
    for (int i = 0; i < 8; i++) {
      World.placeHorizontalWall(7 + i, 0);
    }
    for (int i = 0; i < 6; i++) {
      World.placeHorizontalWall(7 + i, 8);
    }
    for (int i = 0; i < 2; i++) {
      World.placeHorizontalWall(13 + i, 6);
    }

    Robot robot = new Robot(2, 6, DOWN, 200);

    // Zu einer konvexen Ecke

    boolean notFinished1 = true;
    boolean nextTurnLeft = true;
    while (notFinished1) {
      if (robot.isFrontClear()) {
        robot.move();
      } else {
        if (nextTurnLeft) {
          robot.turnLeft();
        } else {
          for (int i = 0; i < 3; i++) {
            robot.turnLeft();
          }
        }
        nextTurnLeft = !nextTurnLeft;
        if (!robot.isFrontClear()) {
          notFinished1 = false;
        }
      }
    }

    // Roboter ausrichten

    while (!robot.isFrontClear()) {
      robot.turnLeft();
    }

    // Hauptschleife

    boolean notFinished2 = true;
    while (notFinished2) {
      robot.putCoin();

      // Roboter nach rechts
      robot.turnLeft();
      robot.turnLeft();
      robot.turnLeft();
      if (robot.isFrontClear()) {
        robot.move();
        if (!robot.isNextToACoin()) {
          continue;
        }

        // Roboter geradeaus

        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
      }
      robot.turnLeft();

      if (robot.isFrontClear()) {
        robot.move();
        if (!robot.isNextToACoin()) {
          continue;
        }

        // Roboter geradeaus

        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
      }
      robot.turnLeft();

      // Roboter nach links

      if (robot.isFrontClear()) {
        robot.move();
        if (!robot.isNextToACoin()) {
          continue;
        }
        notFinished2 = false;
      }
    }
  }
}
