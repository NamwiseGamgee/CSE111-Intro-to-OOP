import java.util.Scanner;
public class CSE111_l1_3 {
  public static void main (String []args) {
    Scanner sc=new Scanner(System.in);
    int a[] =new int [10];
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
    int backup=0,j=0;
    for (int i=0;i<a.length-1;i++) {
      int max=a[i];
      int maxLoc=i;
      for (j=i+1;j<a.length;j++) {
        if (a[j]>max) {
          max=a[j];
          maxLoc=j;
        }
      }
      backup=a[i];
      a[i]=max;
      a[maxLoc]=backup;
    }
    for (int i=0;i<a.length;i++) {
      System.out.print(a[i]+"\t");
    }
  }
}
      
        