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

    public double calculateCost(double meters){
        double cost = pricePerMeter * meters;
        return cost;
    }

    Garment g = new Garment();

}

class Supplier{

    public String id;
    public String name;
    public String contactInfo;
     List<Fabric> suppliedFabrics = new ArrayList<>();

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

    }

}


class Customer{

  public  String customerId;
   public String name;
   public String email;
   public  String phone;

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
