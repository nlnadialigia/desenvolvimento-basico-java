package constructors.exercise;

public class Fiesta {

  public static void main(String[] args) {

    Car fiesta = new Car("Volskwagen", "Hatch", 2015);
    
    System.out.print(fiesta.getBrand() + fiesta.getModel() + fiesta.getYear());
  }
}
