package abstractfactory.vehicles.classes.products;

import abstractfactory.vehicles.interfaces.categories.Vehicle;

public class Car implements Vehicle{
  
  @Override
  public void drive() {
    System.out.println("Dirigindo um carro...");
  }

}
