public class Car {
private static int objectCount;
private int year;
public Car() {
objectCount++;
}
public Car(int year) {
this.year=year;
  objectCount++;
}
public static int getObjectCount() {
return objectCount;
}
public int getYear() {
return year;
}

}