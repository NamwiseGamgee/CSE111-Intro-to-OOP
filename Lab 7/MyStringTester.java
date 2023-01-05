public class MyStringTester{
  public static void main (String[]args){
    char[]c={'G','o','o','d',' ','M','o','r','n','i','n','g'};
    String s="Today is Wednesday";
    MyString ms1=new MyString();
    MyString ms2=new MyString(c);
    MyString ms3=new MyString(s);
 
    //String s=new String("ABC");
    //System.out.println(s.length()); //this will print 3
    //Your MyString class should act like this
 
    
  System.out.println(ms2.endsWith("Morning"));
  System.out.println(ms1.endsWith(""));
  System.out.println(ms3.endsWith("nesDay"));


  }
}