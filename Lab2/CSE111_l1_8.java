import java.util.Scanner;
import static java.lang.System.out;
public class CSE111_l1_8 {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[] =new int [10];
    int b[]=new int [10];
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
       ++b[a[i]];
     }
   for (int i=a.length-1;i>=0;i--) {
     if (b[i]>=2 && b[i]<5) {
     out.print(i+",");
    
     }
   }
  }
}
    
