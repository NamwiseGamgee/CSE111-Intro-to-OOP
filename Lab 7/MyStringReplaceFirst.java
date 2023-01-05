public class MyStringReplaceFirst{
  char[]c;
  public MyStringReplaceFirst(){
 
    c=new char[0];
 
  }
  public MyStringReplaceFirst(String s){
    c=s.toCharArray();
  }
  public MyStringReplaceFirst(char[]x){
    c=new char[x.length];
    for(int i=0;i<x.length;i++){
      c[i]=x[i];
    }
  }
  public String replaceFirst(char oldChar, char newChar) {
    String s="";
    for (int i=0;i<c.length;i++) {
      if(c[i]==oldChar) {
      c[i]=newChar;
      }
      s=s+c[i];
    }
  return s;
  }
}