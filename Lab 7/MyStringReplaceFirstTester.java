public class MyStringReplaceFirstTester{
  public static void main (String[]args){
    char[]c={'G','o','o','d',' ','M','o','r','n','i','n','g'};
    String s="Today is Wednesday";
    MyStringReplaceFirst ms1=new MyStringReplaceFirst();
    MyStringReplaceFirst ms2=new MyStringReplaceFirst(c);
    MyStringReplaceFirst ms3=new MyStringReplaceFirst(s);
 
    //String s=new String("ABC");
    //System.out.println(s.length()); //this will print 3
    //Your MyString class should act like this
 
    
  //System.out.println(ms2.endsWith("Morning"));
  //System.out.println(ms1.endsWith(""));
  //System.out.println(ms3.endsWith("nesDay"));

 System.out.println(ms2.replaceFirst('o','x'));
 System.out.println(ms3.replaceFirst('d',' '));
  }
}