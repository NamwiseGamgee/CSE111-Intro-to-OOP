public class Vehicle2010 extends Vehicle {
  public Vehicle2010() {
//super(); 
  }
  public void moveLowerLeft() {
    moveDown();
    moveLeft();
  }
  public void moveLowerRight() {
    moveDown();
    moveRight();
  }
  public void moveUpperLeft() {
    moveUp();
    moveLeft();
  }
  public void moveUpperRight() {
    moveUp();
    moveRight();
  }
}
