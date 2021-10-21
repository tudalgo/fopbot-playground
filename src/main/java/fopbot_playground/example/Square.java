package fopbot_playground.example;

import fopbot.Robot;
import fopbot.World;

import static fopbot.Direction.LEFT;
import static fopbot.Direction.RIGHT;

public class Square {
  public static void main(String[] args) {
    World.setSize(10, 10);
    World.setDelay(0);
    World.setVisible(true);

    Robot bot = new Robot(0, 0, RIGHT, 20);
    Robot bot2 = new Robot(9, 9, LEFT, 20);

    for (int i = 0; i < 9; i++) {
      bot.putCoin();
      bot2.putCoin();
      bot.move();
      bot2.move();
    }

    bot.turnLeft();
    bot2.turnLeft();

    for (int i = 0; i < 9; i++) {
      bot.putCoin();
      bot2.putCoin();
      bot.move();
      bot2.move();
    }
  }
}
