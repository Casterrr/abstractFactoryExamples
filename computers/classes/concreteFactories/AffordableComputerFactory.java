package abstractfactory.computers.classes.concreteFactories;

import abstractfactory.computers.classes.products.affordable.AffordableNotebook;
import abstractfactory.computers.classes.products.affordable.AffordableSmartphone;
import abstractfactory.computers.interfaces.categories.Computer;
import abstractfactory.computers.interfaces.factories.ComputerFactory;

public class AffordableComputerFactory implements ComputerFactory {

  @Override
  public Computer produceNotebook() {
    return new AffordableNotebook(800, 1500);
  }

  @Override
  public Computer produceSmartphone() {
    return new AffordableSmartphone(400, 800);
  }

}
