public class MyString{
  char[]c;
  public MyString(){
    c=new char[0];
  }
  public MyString(String s){
    c=s.toCharArray();
  }
  public MyString(char[]x){
    c=new char[x.length];
    for(int i=0;i<x.length;i++){
      c[i]=x[i];
    }
  }
  public int length(){
    
    return c.length;
  }
  char charAt(int n){
   
    if (n<0 || n>=c.length) {
  
    return (char)0;
    }
    return c[n];
  }
  public boolean startsWith(String prefix) {
    boolean flag=true;
  char []prefArray=prefix.toCharArray();
  if (prefArray.length>c.length) {
  return false; 
  }
  else if (prefArray.length==0){
  return true;
  }
  else {
    for (int i=0;i<prefArray.length;i++) {
      if (prefArray[i]==c[i]) {
      
      }
      else {
      flag= false;
      break;
      }
    }
  }
  return flag;
  }
}
