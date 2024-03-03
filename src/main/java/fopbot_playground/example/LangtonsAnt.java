package fopbot_playground.example;

import fopbot.Direction;
import fopbot.Robot;
import fopbot.World;

public class LangtonsAnt {

  // https://en.wikipedia.org/wiki/Langton%27s_ant

  public static void main(String[] args) {
    World.setSize(20, 20);
    World.setDelay(25);
    World.setVisible(true);

    var ant = new Robot(World.getWidth() / 2, World.getHeight() / 2, Direction.RIGHT, 999);

    while (ant.hasAnyCoins() && ant.isFrontClear()) {

      if (ant.isNextToACoin()) {
        ant.pickCoin();

        ant.turnLeft();
        ant.turnLeft();
        ant.turnLeft();
      } else {
        ant.putCoin();

        ant.turnLeft();
      }

      ant.move();
    }
  }
}
