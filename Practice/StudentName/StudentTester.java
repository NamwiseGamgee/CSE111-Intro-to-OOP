public class StudentTester {
  public static void main (String []kolakabanakemamo) {
    Student john=new Student();
    john.setName("John Cena");
    john.setID(18101416);
    john.setCGPA(1.74);
    System.out.println("Ki nam tor?- "+john.getName());
    System.out.println("ID ko tattari- "+john.getID());
    System.out.println("ki poraleha koros hauua, cg dekh- "+john.getCGPA());
    Student naeem=new Student();
    naeem.setName("Naeem bay");
    naeem.setID(18101411);
    naeem.setCGPA(0.74);
    System.out.println("Ki nam tor?- "+naeem.getName());
    System.out.println("ID ko tattari- "+naeem.getID());
    System.out.println("ki poraleha koros hauua, cg dekh- "+naeem.getCGPA()+" John o totte valo");
  }
}
