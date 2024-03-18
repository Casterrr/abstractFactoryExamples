package abstractfactory.vehicles.interfaces.factories;

import abstractfactory.vehicles.interfaces.categories.Vehicle;

public interface VehicleFactory {
  Vehicle produceCar();
  Vehicle produceMotorcycle();
}
