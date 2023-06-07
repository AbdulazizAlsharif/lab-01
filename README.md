[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-8d59dc4de5201274e310e4c54b9627a8934c3b88527886e3b421487c677d23eb.svg)](https://classroom.github.com/a/NueuWj0s)

# CPIT252 LAB1 
## 1. Instance and class variables
Changing the quantity into static.

    private static int quantity; 

## 2. Testing
 
        public class ProductTest 
        {
        @Test
        public void shouldCountQuantity()
        {
         Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",200.0,LocalDate.parse("2022-06-07"));
         Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",200.0, LocalDate.parse("2022-06-07"));
         Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta",200.0, LocalDate.parse("2022-06-07"));
         assertEquals(p3.getTotalQuantity(), 3);
        }

        }

## 3. Inhertiance
Changing the Product class to be abstract.

    public abstract class Product

## 4-Polymorphism “Many Forms”

    Product[]  products ={p1,p2,p3,p4,p5,p6};
    for(Product p: products){
      System.out.println(p.toString());
    }

## 5. Controlling Changes
Changing the addToShoppingCart method to be final.

    public final void addToShoppingCart() 

## 6. Abstraction
I make another class for order.

    public class Order {
    private int orderId;
    private String orderStatus;
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public Order(int orderId, String orderStatus) {
        this.orderId = orderId;
        this.orderStatus = orderStatus;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + "]";
    }
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    }

## 7. Encapsulation
weight is private and can accessible by setter and getter 


         public class Product {

          private double weight;
            public double getWeight() {
              return this.weight;
             }
            public void setWeight(double weight) {
              if(weight<0){
                 throw new IllegalArgumentException("Invalid weight value");
              }
              this.weight = weight;
      }
     }
