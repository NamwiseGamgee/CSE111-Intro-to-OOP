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
  
  public boolean endsWith(String suffix) {
   boolean flag=true;
   char a[]=suffix.toCharArray();
   if(a.length==0) {
    return true;
   }
   else if(a.length>c.length){
    return false;
   }
   else  {
    for (int i=c.length-1, j=a.length-1; i>=(c.length-a.length) && j>=0; j--,i--) {
     if (a[j]==c[i]) {
 
     }
     else {
      flag=false;
      break;
     }
    }
   }
   return flag;
  }
 
}
