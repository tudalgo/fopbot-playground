package fopbot_playground.example;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

import java.util.Random;

public class WallMaze {

  private static final Random random = new Random();

  private static void recursiveDivide(int x1, int y1, int x2, int y2, boolean horizontal) {
    boolean horizontalPossible = y2 - y1 > 0;
    boolean verticalPossible = x2 - x1 > 0;

    if (!horizontalPossible || !verticalPossible) {
      return;
    }

    var x = random.nextInt(x2 - x1) + x1;
    var y = random.nextInt(y2 - y1) + y1;

    if (horizontal) {
      for (int cx = x1; cx <= x2; cx++) {
        if (cx != x) {
          World.placeHorizontalWall(cx, y);
        }
      }
      recursiveDivide(x1, y1, x2, y, false);
      recursiveDivide(x1, y + 1, x2, y2, false);
    } else {
      for (int cy = y1; cy <= y2; cy++) {
        if (cy != y) {
          World.placeVerticalWall(x, cy);
        }
      }
      recursiveDivide(x1, y1, x, y2, true);
      recursiveDivide(x + 1, y1, x2, y2, true);
    }
  }

  public static void main(String[] args) {
    World.setSize(4, 4);
    World.setVisible(true);

    recursiveDivide(0, 0, World.getWidth() - 1, World.getHeight() - 1, random.nextBoolean());

    var r = new Robot(0, 0, Direction.RIGHT, 999);

    MazeSolver.solveMaze(r);
  }
}
