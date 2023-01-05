import java.util.Scanner;
import static java.lang.System.out;
public class CSE111_l1_5 {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    double i;
    double e=sc.nextDouble();
    double r=sc.nextDouble();
    double l=sc.nextDouble();
    double c=sc.nextDouble();
    double f=sc.nextDouble();
    i=(e)/ (Math.sqrt((r*r)+Math.pow((2*Math.PI*f*l)-1/(2*Math.PI*f*c),2)));
    out.printf("Current, I = %.4f",i);
    out.println(" amp");
  }
}