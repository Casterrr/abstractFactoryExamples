package abstractfactory.computers.classes.concreteFactories;

import abstractfactory.computers.classes.products.highend.HighEndNotebook;
import abstractfactory.computers.classes.products.highend.HighEndSmartphone;
import abstractfactory.computers.interfaces.categories.Computer;
import abstractfactory.computers.interfaces.factories.ComputerFactory;

public class HighEndComputerFactory implements ComputerFactory{

  @Override
  public Computer produceNotebook() {
    return new HighEndNotebook(5000,8000);
  }

  @Override
  public Computer produceSmartphone() {
    return new HighEndSmartphone(3000,5000);
  }

}
