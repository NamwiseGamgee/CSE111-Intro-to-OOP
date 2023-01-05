public class ComplexNumber extends RealNumber{
  public double imaginaryValue;
  public ComplexNumber(){
  super(1);
  imaginaryValue=1;
  }
  public ComplexNumber(double r,double i){
  super(r);
  imaginaryValue=i;
  }
  public String toString(){
  
  return super.toString()+"\nImaginaryPart : " +imaginaryValue;
  }
  
  public void check(){
  System.out.println("I'm in ComplexNumber class");
  super.ping();
  System.out.println("Checking end");
  }
}