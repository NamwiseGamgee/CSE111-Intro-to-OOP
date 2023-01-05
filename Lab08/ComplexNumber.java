public class ComplexNumber extends RealNumber {
  public double imaginaryValue;
  public ComplexNumber() {
  setRealValue(1.0);
  imaginaryValue=1.0;
  }
  public ComplexNumber(int x,int y) {
  super(x);
  imaginaryValue=y;
  }
  public String toString() {
  return super.toString()+"\n"+"ImaginaryPart :"+imaginaryValue;
  }
  public void check() {
  System.out.println("I'm in ComplexNumber class");
  ping();
  System.out.println("Checking ended");
  }
}