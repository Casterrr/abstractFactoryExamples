package abstractfactory.computers.interfaces.factories;

import abstractfactory.computers.interfaces.categories.Computer;

public interface ComputerFactory {
  Computer produceNotebook();
  Computer produceSmartphone();
}
