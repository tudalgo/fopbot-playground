package fopbot_playground.example;

import fopbot.Robot;
import fopbot.World;

public class MazeSolver {

  // https://www.reddit.com/r/ProgrammerHumor/comments/qmiavc/no_this_is_the_dumbest_way_to_solve_a_maze/

  public static void solveMaze(Robot r) {
    while (r.hasAnyCoins()) {
      if (r.getX() == World.getWidth() - 1 && r.getY() == World.getHeight() - 1) {
        break;
      }

      if (r.isFrontClear()) {
        r.move();
        if (r.isNextToACoin()) {
          r.turnLeft();
          r.turnLeft();
          r.move();
          r.turnLeft();
          r.turnLeft();
        } else {
          continue;
        }
      }
      r.turnLeft();

      if (r.isFrontClear()) {
        r.move();
        if (r.isNextToACoin()) {
          r.turnLeft();
          r.turnLeft();
          r.move();
        } else {
          continue;
        }
      } else {
        r.turnLeft();
        r.turnLeft();
      }

      if (r.isFrontClear()) {
        r.move();
        if (r.isNextToACoin()) {
          r.turnLeft();
          r.turnLeft();
          r.move();
          r.turnLeft();
        } else {
          continue;
        }
      } else {
        r.turnLeft();
        r.turnLeft();
        r.turnLeft();
      }

      r.putCoin();
      r.move();
    }

    while (true) {
      if (r.hasAnyCoins()) {
        r.putCoin();
      }
      r.turnLeft();
    }
  }
}
