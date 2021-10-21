package fopbot_playground.example;

public class PacmanStrategy2 implements PacmanStrategy {
  private boolean nextTurnLeft;
  private boolean itsTheFirstStep;

  public PacmanStrategy2() {
    nextTurnLeft = true;
    itsTheFirstStep = true;
  }

  public int numberOfLeftTurns() {
    int result = 0;
    if (itsTheFirstStep) {
      result = nextTurnLeft ? 1 : 3;
      nextTurnLeft = !nextTurnLeft;
    }
    itsTheFirstStep = !itsTheFirstStep;
    return result;
  }
}
