import java.util.Scanner;
import static java.lang.System.out;
public class CSE111_l1_7 {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[] =new int [11];
   for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
      int cnt=0;
      for (int c=0;c<i;c++) {
        if (a[c]==a[i]) {
          cnt++;
          if (cnt>=4) {
            out.println("Enter again: ");
            i--;
            break;
          }
          }
    }
   }
   for (int i=0;i<a.length;i++) {
     out.print(a[i]+"\t");
   }
  }
}
    
