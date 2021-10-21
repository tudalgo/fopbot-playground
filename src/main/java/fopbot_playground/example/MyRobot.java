package fopbot_playground.example;

public class MyRobot {
  private int x;
  private int y;
  private MyDirection direction;
  private int numberOfCoins;

  public MyRobot(int initX, int initY, MyDirection initDirection, int initNumberOfCoins) {
    x = initX;
    y = initY;
    direction = initDirection;
    numberOfCoins = initNumberOfCoins;
  }

  public void move() {
    if (direction == MyDirection.UP) {
      y++;
    } else if (direction == MyDirection.RIGHT) {
      x++;
    } else if (direction == MyDirection.DOWN) {
      y--;
    } else {
      // i.e., direction == MyDirection.LEFT
      x--;
    }
  }

  public void turnLeft() {
    if (direction == MyDirection.UP) {
      direction = MyDirection.LEFT;
    } else if (direction == MyDirection.LEFT) {
      direction = MyDirection.DOWN;
    } else if (direction == MyDirection.DOWN) {
      direction = MyDirection.RIGHT;
    } else {
      // i.e., direction == MyDirection.RIGHT
      direction = MyDirection.UP;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public MyDirection getDirection() {
    return direction;
  }

  public int getNumberOfCoins() {
    return numberOfCoins;
  }

  public boolean hasAnyCoins() {
    return numberOfCoins > 0;
  }

  public void setX(int newX) {
    x = newX;
  }

  public void setY(int newY) {
    y = newY;
  }

  public void setPosition(int newX, int newY) {
    x = newX;
    y = newY;
  }

  public void copy(MyRobot otherRobot) {
    x = otherRobot.x;
    y = otherRobot.y;
    direction = otherRobot.direction;
    numberOfCoins = otherRobot.numberOfCoins;
  }
}
