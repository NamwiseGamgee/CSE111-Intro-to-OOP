public class MyComplexTester {
  public static void main(String[] args) {
    MyComplex a = new MyComplex();
    MyComplex b = new MyComplex();
    a.setRealPart(3);
    a.setImaginaryPart(5);
    b.setRealPart(20);
    b.setImaginaryPart(40);
    MyComplex c = a.add(b);
    System.out.println(c);
  }
}