public class Account{
  public String name="Default Account";
  public static double interestRate=5.0;
  public static double number=0.0;
  
  public Account(){
  }
  
  public Account(String s,double i) { 
  name=s;
  number=i;
  }
  
  public String nameKi() {
  return name;
  }
  
  public double balanceKi() {
  return number;
  }
  
  public void nameBoshao(String s) {
  this.name=s;
  }
  public void balanceBoshao(double i) {
  this.number=i;
  }
}