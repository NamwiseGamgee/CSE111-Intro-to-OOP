public class Vehicle{
   int x;
   int y;
  public Vehicle(){
    x=0;
    y=0;
  }
  
  public void moveUp(){
  y++;
  }
  public void moveLeft(){
  x--;
  }
  public void moveDown(){
  y--;
  }
  public void moveRight(){
  x++;
  }
  public String toString(){
  
  return "("+x+", "+y+")";
  }
}