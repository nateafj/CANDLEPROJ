public class CandleShop {
    public double calculateDollarPerBurnTime(double price, double burnTime) {
        return price / burnTime;
    }

    public void printReceipt(String candleName) {
        // You can adjust these values according to the specific candles in your store
        int quantity = 1;
        double burnTime = 6.0;  // in hours
        double price = 10.99;   // per candle

        double totalBurnTime = quantity * burnTime;
        double totalDollarPerBurnTime = calculateDollarPerBurnTime(price, totalBurnTime);
        double totalPrice = price * quantity;
        double dollarPerBurnTime = calculateDollarPerBurnTime(price, burnTime);

        System.out.println("Receipt:");
        System.out.println("-------------------------------------------------");
        System.out.println("Candle: " + candleName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Burn Time per Candle: " + burnTime + " hours");
        System.out.println("Total Burn Time: " + totalBurnTime + " hours");
        System.out.printf("Dollar per Burn Time (Per Candle): $%.2f per hour%n", dollarPerBurnTime);
        System.out.printf("Total Dollar per Burn Time: $%.2f per hour%n", totalDollarPerBurnTime);
        System.out.printf("Price per Candle: $%.2f%n", price);
        System.out.println("-------------------------------------------------");
        System.out.printf("Total Price: $%.2f%n", totalPrice);
    }
}
