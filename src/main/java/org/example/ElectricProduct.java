package org.example;

public class ElectricProduct extends Product {

  private String voltage;

  public ElectricProduct(int id, double price, String name, double weight, String voltage) {
    super(id, price, name, weight);
    this.voltage = voltage;
  }

  @Override
  public void getSellableStatus() {
    System.out.println("this product is sallble");
  };

  @Override
  public String toString() {
    return super.toString() + "\t Voltage: " + this.voltage;
  }

}