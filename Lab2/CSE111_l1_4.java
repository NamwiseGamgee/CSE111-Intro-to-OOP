import java.util.Scanner;
import static java.lang.System.out;
public class CSE111_l1_4 {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[] =new int [5];
   for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
      for (int c=0;c<i;c++) {
        if (a[c]==a[i]) {
          out.println("Enter again: ");
          i--;
        }
      }
    }
   for (int i=0;i<a.length;i++) {
     out.print(a[i]+"\t");
   }
  }
}
    
