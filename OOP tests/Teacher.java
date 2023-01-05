public class Teacher {
  String name,department;
  String courseName="";
  public Teacher (String name,String dept) {
    this.name=name;
    department=dept;
  }
  public void addCourse(Course c) {
  courseName+=c.toString()+"\n";
  }
  public void printDetail() {
  System.out.println("=================");
  System.out.println("Name: "+name);
  System.out.println("Department: "+department);
  System.out.println("List of courses: ");
  System.out.println("=================");
  System.out.println(courseName);
  System.out.println("=================");
  }
}
  
  