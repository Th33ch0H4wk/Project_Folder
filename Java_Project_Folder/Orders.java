
/**
 * Write a description of class OnlineStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Orders
//nullifying direct instantiation and simplifying the instances so when called from its subclasses, they can call back certain instances inside the main class
{
 //making fields that despite being in an abstract superclass, is able to be inherited through super();
 private String OrderID;
 private double TotalAmount;
 private String Address;
 protected double StandardShippingCosts = 10.00; // Shared for all subclasses, default for calculating the shipping fee and total
 // Constructing fields that the other orders can inherit 
   public Orders(String OrderID, double TotalAmount, String Address){
      this.OrderID = OrderID;
      this.TotalAmount = TotalAmount;
      this.Address = Address;
 }
 public double getStandardShippingCosts(){
     // can be accessed for the main method
     return StandardShippingCosts;
 }
     public String getOrderID(){
        return OrderID;
   }
   public double getTotalAmount(){
       return TotalAmount;
   }
   public String getAddress(){
       return Address;
   }
    public void setOrderID(String OrderID){ 
     // no return value
      this.OrderID = OrderID;
      }
    public void setTotalAmount(double TotalAmount){
      this.TotalAmount = TotalAmount;
      }
    public void setAddress(String CurrentAddress){
      this.Address= CurrentAddress;
      }
        public abstract double CalculateShipping();
        //automatically calls a method from the subclasses 
        public abstract String getType();
        //does the same thing 
            public void displayOrderInformation(){
        System.out.println("Order ID: " + OrderID);
        System.out.println("Type: " + getType());  // this uses the method from subclass
        System.out.println("Amount (Shipping cost not included): RM" + TotalAmount);
        System.out.println("Address: " + Address);
        System.out.println("Total Shipping: RM" + CalculateShipping());
            }
                }

