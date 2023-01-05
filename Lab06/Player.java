public class Player {
  private String name="defaut name";
  private int number = 0;  
  private String team = "Default"; 
  public Player() {
  
  }
  public void setName(String s) {
  name=s;
  }
  public void setNumber(int x){
  number=x;
  }
  public void setTeam(String s) {
  team=s;
  }
  public void detail() {
  System.out.println(name+"*is*no."+number+"*for*"+team);
  }
  public Player(String s) {
  name=s;
  }
  public Player(String s,int x) {
  name=s;
  number=x;
  }
  public Player (String s,int x,String t){
  name=s;
  number=x;
  team=t;
  }
}