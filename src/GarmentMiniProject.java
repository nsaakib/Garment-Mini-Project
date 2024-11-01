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
    private List<Fabric> suppliedFabrics = new ArrayList<>();

    public void addFabric(Fabric fabric){
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

    public void addGarment(Garment garment){
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

    String customerId;
    String name;
    String email;
    String phone;

    void placeOrder(Order order){

    }

    List<Order> viewOrders(){
        return null;
    }

}

class Inventory{

    List<Garment> garments ;


    void addGarment(Garment garment){

    }

    void removeGarment(String id){

    }

    Garment findGarment(String id){

        return null;

    }


}

public class GarmentMiniProject {
    public static void main(String[] args) {

    }
}
