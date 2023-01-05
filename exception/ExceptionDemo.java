import java.util.Scanner;
public class ExceptionDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count=1;
    do {
      try {
        System.out.println("Please enter num1: ");
        int num1=sc.nextInt();
        System.out.println("Please enter num2: ");
        int num2=sc.nextInt();
        System.out.println("Result:"+num1+"/"+num2+" = "+num1/num2);
        count=2;
      }catch(Exception e) {
        System.out.println("Exception: "+e);
        System.out.println("You must enter an INTEGER which has to be greater than zero. Please try again");
        System.out.println("Please enter an num1 : ");
      }
      
    }while (count==1);

  }
}