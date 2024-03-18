package abstractfactory.vehicles.classes.concreteFactories;

import abstractfactory.vehicles.classes.products.Car;
import abstractfactory.vehicles.classes.products.MotorCycle;
import abstractfactory.vehicles.interfaces.categories.Vehicle;
import abstractfactory.vehicles.interfaces.factories.VehicleFactory;

public class IronVehicleFactory implements VehicleFactory {

  @Override
  public Vehicle produceCar() {
      return new Car();
  }

  @Override
  public Vehicle produceMotorcycle() {
    return new MotorCycle();
  }

}
