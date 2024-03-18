package abstractfactory.computers.classes.products.affordable;

import abstractfactory.computers.interfaces.categories.Computer;

public class AffordableSmartphone implements Computer {
  private float minPrice;
  private float maxPrice;

  public AffordableSmartphone(float minPrice, float maxPrice) {
    this.minPrice = minPrice;
    this.maxPrice = maxPrice;
  }

  @Override
  public void turnOn() {
    System.out.println("Ligando o celular...");
  }

  @Override
  public void turnOff() {
    System.out.println("Desligando o celular...");
  }

  @Override
  public void showGUI() {
    System.out.println("Carregando informações do sistema...");
  }

  @Override
  public String getPriceRange() {
    return String.format("Entre %.2f e %.2f reais.", this.minPrice, this.maxPrice);
  }

}
