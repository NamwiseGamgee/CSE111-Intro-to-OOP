import java.util.Scanner;
public class CSE111_l1_2 {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int a[] =new int [10];
   
    
    for (int cnt=0;cnt<a.length;cnt++) {
      a[cnt]=sc.nextInt();
      for (int i=0;i<=cnt;i++) {
        if(cnt==0) {
         System.out.print("You have entered "); 
        }
      System.out.print(a[i]);
      if(i!=cnt) {
        System.out.print(" ,");
      }
    }
    }
  }
}