import java.util.Scanner;
public class MyStringTester{
  public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    char[]c={'G','o','o','d',' ','M','o','r','n','i','n','g'};
    String s="Today is Wednesday";
    MyString ms1=new MyString();
    MyString ms2=new MyString(c);
    MyString ms3=new MyString(s);
    
    //String s=new String("ABC");
    //System.out.println(s.length()); //this will print 3
    //Your MyString class should act like this
//    System.out.println(ms1.length()); //this will print 0
//    System.out.println(ms2.length()); //this will print 12
//    System.out.println(ms3.length()); //this will print 18
   // System.out.println("Index number for ms1: ");
    //int abc=sc.nextInt();
    //System.out.println(ms1.charAt(abc));
    //System.out.println("Index number for ms2 ");
    //abc=sc.nextInt();
    //System.out.println(ms2.charAt(abc));
    
    //System.out.println("Index number for ms3 ");
     //abc=sc.nextInt();
    //System.out.println(ms3.charAt(abc));
    System.out.println(ms1.startsWith(""));  //returns true
     System.out.println(ms2.startsWith("Today is"));//returns false
      System.out.println(ms3.startsWith("Today"));//returns true
  }
}
