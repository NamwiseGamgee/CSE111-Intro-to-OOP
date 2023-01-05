public class TestTeacher1{
  public static void main(String [] args){
    Teacher1 t1 = new Teacher1("Saad Abdullah", "CSE");
    Teacher1 t2 = new Teacher1("Mumit Khan", "CSE");
    Teacher1 t3 = new Teacher1("Sadia Kazi", "CSE");                             
    Course1 c1 = new Course1("CSE 110 Programming Language I");                           
    Course1 c2 = new Course1("CSE 111 Programming Language-II");                           
    Course1 c3 = new Course1("CSE 220 Data Structures");                           
    Course1 c4 = new Course1("CSE 221 Algorithms");                           
    Course1 c5 = new Course1("CCSE 230 Discrete Mathematics");                           
    Course1 c6 = new Course1("CSE 310 Object Oriented Programming");                           
    Course1 c7 = new Course1("CSE 320 Data Communications");                           
    Course1 c8 = new Course1("CSE 340 Computer Architecture");  
    t1.addCourse(c1);
    t1.addCourse(c2);
    t2.addCourse(c3);
    t2.addCourse(c4);
    t2.addCourse(c5);
    t3.addCourse(c6);
    t3.addCourse(c7);
    t3.addCourse(c8);
    t1.printDetail();
    t2.printDetail();
    t3.printDetail();
  }
}
