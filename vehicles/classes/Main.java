package abstractfactory.vehicles.classes;

import abstractfactory.vehicles.classes.concreteFactories.IronVehicleFactory;
import abstractfactory.vehicles.interfaces.categories.Vehicle;
import abstractfactory.vehicles.interfaces.factories.VehicleFactory;

public class Main {
  public static void main(String[] args) {
    // Criando uma fábrica concreta
    VehicleFactory factory = new IronVehicleFactory();

    // Produzindo um carro
    Vehicle car = factory.produceCar();
    car.drive();  // Saída: Dirigindo um carro...

    // Produzindo uma moto
    Vehicle motorcycle = factory.produceMotorcycle();
    motorcycle.drive();  // Saída: Digirindo uma motocicleta...
  }
}
