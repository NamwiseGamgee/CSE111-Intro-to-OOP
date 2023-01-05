public class Test{
public static void main(String [] args){
Student s1 = new Student("Bob");
Student s2 = new Student("Tom");
Student s3 = new Student("Jack");
Student s4 = new Student("Jill");
Printer pr = new Printer();
pr.printDetail(s1);
pr.printDetail(s2);
pr.printDetail(s3);
pr.printDetail(s4);
}
}
