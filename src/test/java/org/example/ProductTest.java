package org.example;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ProductTest {
  @Test
  public void shouldCountQuantity() {
    Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", 200.0, LocalDate.parse("2022-06-07"));
    Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", 200.0, LocalDate.parse("2022-06-07"));
    Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", 200.0, LocalDate.parse("2022-06-07"));
    assertEquals(p3.getTotalQuantity(), 3);
  }

}
