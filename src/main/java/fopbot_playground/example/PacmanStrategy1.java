package fopbot_playground.example;

public class PacmanStrategy1 implements PacmanStrategy {
  private boolean nextTurnLeft;

  public PacmanStrategy1() {
    nextTurnLeft = true;
  }

  public int numberOfLeftTurns() {
    int result = nextTurnLeft ? 1 : 3;
    nextTurnLeft = !nextTurnLeft;
    return result;
  }
}
