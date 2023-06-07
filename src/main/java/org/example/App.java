package org.example;

import java.time.LocalDate;

public class App {

  public static void main(String[] args) {
    Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", 200.0, LocalDate.parse("2022-06-07"));
    Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", 200.0, LocalDate.parse("2022-06-07"));
    Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", 200.0, LocalDate.parse("2022-06-07"));
    System.out.println("Total Quantity: " + p3.getTotalQuantity());

    Product p6 = new FoodProduct(1234, 9.99, "water", 200.0, LocalDate.parse("2022-06-07"));
    FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 200.0, LocalDate.parse("2022-06-07"));
    ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", 200.0, "220v");

    Product[] products = { p1, p2, p3, p4, p5, p6 };
    for (Product p : products) {
      System.out.println(p.toString());
    }
  }
}
