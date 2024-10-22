package fopbot_playground.example;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

import java.util.Random;

public class BlockMaze {

  private static final Random random = new Random();

  private static void recursiveDivide(int x1, int y1, int x2, int y2, boolean horizontal) {
    boolean horizontalPossible = y2 - y1 > 1;
    boolean verticalPossible = x2 - x1 > 1;

    if (!horizontalPossible || !verticalPossible) {
      return;
    }

    var x = random.nextInt(x2 - x1) + x1;
    var y = random.nextInt(y2 - y1) + y1;

    if (horizontal) {
      for (int cx = x1; cx <= x2; cx++) {
        if (cx != x) {
          World.placeBlock(cx, y);
        }
      }
      recursiveDivide(x1, y1, x2, y - 1, false);
      recursiveDivide(x1, y + 1, x2, y2, false);
    } else {
      for (int cy = y1; cy <= y2; cy++) {
        if (cy != y) {
          World.placeBlock(x, cy);
        }
      }
      recursiveDivide(x1, y1, x - 1, y2, true);
      recursiveDivide(x + 1, y1, x2, y2, true);
    }
  }

  public static void main(String[] args) {
    World.setSize(9, 9);
    World.setVisible(true);

    recursiveDivide(1, 1, World.getWidth() - 1, World.getHeight() - 1, random.nextBoolean());

    var r = new Robot(0, 0, Direction.UP, 999);

    MazeSolver.solveMaze(r);
  }
}
