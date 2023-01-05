import java.util.*;
import static java.lang.System.out;
public class CSE111_l1_6 {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for (int i=1;i<=n;i++) {
      if (i%2==0) {
        sum=sum-(i*i);
      }
      else sum=sum+(i*i);
    }
    out.println("Y = "+sum);
  }
}