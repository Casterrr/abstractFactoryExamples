package abstractfactory.computers.classes;

import abstractfactory.computers.classes.concreteFactories.AffordableComputerFactory;
import abstractfactory.computers.classes.concreteFactories.HighEndComputerFactory;
import abstractfactory.computers.interfaces.categories.Computer;
import abstractfactory.computers.interfaces.factories.ComputerFactory;

public class Main {
  public static void main(String[] args) {
    // Criando uma fábrica concreta de produtos de alto nível
    ComputerFactory highEndFactory = new HighEndComputerFactory();
    // Criando uma fábrica concreta de produtos acessíveis
    ComputerFactory AffordableFactory = new AffordableComputerFactory();

    // Produzindo um notebook de alto nível
    Computer highEndNotebook = highEndFactory.produceNotebook();
    highEndNotebook.turnOn();  // Saída: Ligando o sistema...
    highEndNotebook.showGUI();  // Saída: Carregando interface gráfica do sistema...

    // Produzindo um celular de preço acessível
    Computer AffordableSmartPhone = AffordableFactory.produceSmartphone();
    AffordableSmartPhone.turnOn();  // Saída: Ligando o celular...
    AffordableSmartPhone.showGUI(); // Saída: Carregando informações do sistema...
  }
}
