package fopbot_playground.example;

import fopbot.World;

import static fopbot.Direction.UP;

public class SymmTurnerExample {
  public static void main(String[] args) {
    World.setVisible(true);
    SymmTurner st = new SymmTurner(3, 2, UP, 20);
    st.turnLeft();
    st.move();
    st.turnRight();
  }
}
