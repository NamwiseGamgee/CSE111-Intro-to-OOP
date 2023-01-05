public class Teacher1
{
  public String a;
  public String b;
  public String d=" ";
  public int count=1;
  public Teacher1(String s,String r)
  {
    a=s;
    b=r;
    count++;
  } 
  
  public  void addCourse(Course1 c)
  {
    d+=c.n+"\n";
  }
  public void printDetail()
  {
    System.out.println("========================"+"\nName: "+a+"\nDepartment: "+b+"\nList of courses"+"\n========================"+"\n"+d+"\n========================");
  }
}
