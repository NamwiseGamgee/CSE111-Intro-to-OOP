public class CheckingAccount extends Account {
  public static int numberOfAccount;
  public CheckingAccount() {
    super(0.0);
    numberOfAccount++;
  }
  public CheckingAccount(double balance) {
    super(balance);
    numberOfAccount++;
  }
  
}