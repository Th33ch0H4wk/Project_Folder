
/**
 * Write a description of class ExpressOrders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExpressOrders extends Orders
{
// additional fee for fast delivery, treated as private so it can not be improved upon 
 private double AdditionalFee = 25.00;
  public ExpressOrders(String OrderID, double TotalAmount, String Address){
  super(OrderID, TotalAmount, Address);
}
  public double CalculateShipping(){
     return StandardShippingCosts * AdditionalFee / 100;
 }
 public String getType(){
     return "Express Order";
 }
}