public class OnlineStore
{
    public static void main(String[] args) {     //making an instant of arrays and objects attributes in arrays
        Orders[] orders= new Orders[3];
        orders[0] = new RegularOrders ("R001", 50.60, "No.53, Jalan Pandan Indah, WPKL");
        orders[1] = new ExpressOrders ("E001", 167.50, "DTG-5, Pantai Villa, WPKL");
        orders[2] = new InternationalOrders ("I001", 250.50, "9 Jalan Kenanga, Singapore");
        //initializing values for the for loops (both amount and shipping fee)
         double totalRegular = 0;
         double totalRegularShipping = 0;
         double totalExpress = 0;
         double totalExpressShipping = 0;
         double totalInternational = 0;
         double totalInternationalShipping = 0;
         //created a variable to store the sum amount for all order combined as it is called in the for loop to minimize excessive loop calling, much easier to make a variable that automatically collects in the specific for loops for the orders
         double sumTotalAmount  = 0;
    // Display an organizes by type through figuring out which order belongs to what subclass
    // figures out by comparing the strings the order specifically belongs through a Java String equals() Method that acts as a logical AND operator.
    // for Regular Orders
         System.out.println("=== Regular Orders ===");
          for (Orders Orders : orders) {
             if (Orders.getType().equals("Regular Order")) {
                 Orders.displayOrderInformation();
                 totalRegular += Orders.getTotalAmount();
                 totalRegularShipping += Orders.CalculateShipping();
                 sumTotalAmount  += Orders.getTotalAmount();
             }
         }
    // for Express Orders
         System.out.println("\n=== Express Orders ===");
         for (Orders Orders : orders) {
             if (Orders.getType().equals("Express Order")) {
                 Orders.displayOrderInformation();
                 totalExpress += Orders.getTotalAmount();
                 totalExpressShipping += Orders.CalculateShipping();
                 sumTotalAmount  += Orders.getTotalAmount();
             }
         }
    // for International Orders
        System.out.println("\n=== International Orders ===");
        for (Orders Orders : orders) {
            if (Orders.getType().equals("International Order")) {
                Orders.displayOrderInformation();
                totalInternational += Orders.getTotalAmount();
                totalInternationalShipping += Orders.CalculateShipping();
                sumTotalAmount  += Orders.getTotalAmount();
            }
        }
        // Change address of an order by ID
                for (Orders Orders : orders){
            if (Orders.getOrderID().equals("E001")) {
                Orders .setAddress("99 Jalan Baru");
                System.out.println("\n" + "Updated Address for E001:");
                Orders .displayOrderInformation();
                sumTotalAmount += Orders.getTotalAmount();
            }
    }
    //The First Three print functions print out the total sum of the shipping costs of each orders respective amount and shipping fees and only applies the first 2 decimal points through "RM%2f" and proceeds to a new line soon after
        System.out.printf("\nSum Shipping Costs (Regular): RM%.2f\n", totalRegular + totalRegularShipping);
        System.out.printf("Sum Shipping Costs (Express): RM%.2f\n", totalExpress + totalExpressShipping);
        System.out.printf("Sum Shipping Costs (International): RM%.2f\n", totalInternational + totalInternationalShipping);
        //Summarizes the sum of all Orders amount and their shipping fees, it then combines both into the sum total of all
           double totalShippingSum = totalRegularShipping + totalExpressShipping + totalInternationalShipping;
              System.out.printf("Total sum Order Amounts costs: RM%.2f\n", sumTotalAmount );
              System.out.printf("Total sum Shipping costs: RM%.2f\n", totalShippingSum);
              System.out.printf("Total combined: RM%.2f\n", sumTotalAmount  + totalShippingSum);
    }
        // For loop for Total shipping
        public static double calculateTotalShippingCosts(Orders[] orders) {
        double totalCost = 0.0;
        //for the integer of i being 0, if it is still lower than the length of the array, it is added by a value and by then the totalCost is assigned to the current value of i element in array that is calling out the calculation method from Orders,
        for (int i = 0; i < orders.length; i++) {
        totalCost += orders[i].CalculateShipping();
        }
        return totalCost;}
}   
