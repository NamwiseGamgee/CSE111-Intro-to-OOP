public class Square {
  private double area,height,width;
  public void setHeight(int n) {
  height=n;
  }
  public void setWidth(int x){
  width=x;
  }
  public double getHeight() {
  return height;
  }
  public double getWidth(){
  return width;
  }
  public double getArea(){
    area=height*width;
    return area;
  }
}
  