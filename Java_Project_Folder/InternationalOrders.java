
/**
 * Write a description of class InternationalOrders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InternationalOrders extends Orders
{
    //Custom International Charges, similar case with the first 
 private double CustomDutyCharges = 50;
 public InternationalOrders(String OrderID, double TotalAmount, String Address){
  super(OrderID, TotalAmount, Address);
}
// creating a method
 public double CalculateShipping(){
     return StandardShippingCosts + CustomDutyCharges;
 }
 public String getType(){
     return "International Order";
 }
}