import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class Garment{
    public String id;
    public String name;
    public String description;
    public String size;
    public String color;
    public double price;
    public int stockQuantity;
    Garment(String id , String name , String description,String size, String color, double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.color = color;
        this.price = price;

    }
    public void updateStock(int quantity){
        this.stockQuantity = quantity;
    }
    public double calculateDiscountPrice(double discountPercentage){
        double discount = this.price * discountPercentage / 100;
        return discount;
    }

}

class Fabric {

    public String id;
    public String type;
    public String color ;
    public double pricePerMeter;

    public Fabric(String id, String type, String color, double pricePerMeter) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.pricePerMeter = pricePerMeter;
    }

    public double calculateCost(double meters){
        double cost = pricePerMeter * meters;
        return cost;
    }

   // Garment g = new Garment();

}

class Supplier{

    public String id;
    public String name;
    public String contactInfo;
     List<Fabric> suppliedFabrics = new ArrayList<>();

Supplier(String id, String name , String contactInfo){
    this.id = id;
    this.name = name;
    this.contactInfo = contactInfo;
}
     void addFabric(Fabric fabric){
        suppliedFabrics.add(fabric);
    }


    List<Fabric> suppliedFabrics(){
        return suppliedFabrics;
    }

}

class Order{

    public String orderId;
    public Date orderDate;
    public List<Garment> garments = new ArrayList<>() ;
    public double totalAmount ;

    Order(String orderId, Date orderDate, double totalAmount){
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    void addGarment(Garment garment){
        garments.add(garment);
    }
    public double calculateTotalAmount(){
        for(Garment g: garments){
            totalAmount += g.price;
        }
        return totalAmount;
    }

    public void printOrderDetails() {
        //System.out.println("Order ID: " + orderId);
       // System.out.println("Order Date: " + orderDate);
       // System.out.println("Total Amount: " + calculateTotalAmount());
        System.out.println("--------------------------");
        System.out.println("Order Details");
        System.out.println("--------------------------");
        for (Garment g : garments) {
            System.out.println("Name: " + g.name);
            System.out.println("Price: " + g.price);
            System.out.println("Description: " + g.description);
            System.out.println("--------------------------");
        }
    }

}


class Customer{

  public  String customerId;
   public String name;
   public String email;
   public  String phone;

    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    void placeOrder(Order order){
      order.printOrderDetails();

    }

    List<Order> viewOrders(){
        return null;
    }

}

class Inventory{

    List<Garment> garments ;


    void addGarment(Garment garment){
        garments.add(garment);
    }

    void removeGarment(String id){
       garments.remove(id);
    }

    Garment findGarment(String id){
for(Garment g : garments){
    if(g.id == id)
        return g;
}
        return null;

    }


}

public class GarmentMiniProject {
    public static void main(String[] args) {

    }
}
