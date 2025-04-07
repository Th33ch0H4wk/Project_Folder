
/**
 * Write a description of class RegularOrders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegularOrders extends Orders
{
 public RegularOrders(String OrderID, double TotalAmount, String Address){
 //inheriting fields from Orders
 super(OrderID, TotalAmount, Address);
}
 public double CalculateShipping(){
     return StandardShippingCosts;
}
public String getType(){
    return "Regular Order";
}
}