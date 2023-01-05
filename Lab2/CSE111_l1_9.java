import java.util.Scanner;
import static java.lang.System.out;
public class CSE111_l1_9 {
  public static void main (String []args) {
    Scanner sc=new Scanner(System.in);
    int a[] =new int [10];
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
    out.println("For sorting only the odd positions-Press 1");
    out.println("For sorting only the even positions-Press 2");
    out.println("For sorting all the numbers-Press 3");
    int n=sc.nextInt();
    if (n==1) {
      int backup=0,j=0;
    for (int i=1;i<a.length-1;i+=2) {
      int max=a[i];
      int maxLoc=i;
      for (j=i+2;j<a.length;j+=2) {
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
    else if (n==2) {
      int backup=0,j=0;
    for (int i=0;i<a.length-1;i+=2) {
      int max=a[i];
      int maxLoc=i;
      for (j=i+2;j<a.length;j+=2) {
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
    else {
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
}