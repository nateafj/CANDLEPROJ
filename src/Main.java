import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available candles:");
        System.out.println("1. Sky Blue");
        System.out.println("2. Orange Sunset");
        System.out.println("3. Cloudy Daze");
        System.out.print("Enter the number of the candle you want to purchase: ");

        int choice = scanner.nextInt();
        String candleName = getCandleName(choice);

        if (candleName != null) {
            CandleShop candleShop = new CandleShop();
            candleShop.printReceipt(candleName);
        } else {
            System.out.println("Invalid choice. Please select a valid candle.");
        }
    }

    public static String getCandleName(int choice) {
        switch (choice) {
            case 1:
                return "Sky Blue";
            case 2:
                return "Orange Sunset";
            case 3:
                return "Cloudy Daze";
            default:
                return null;
        }
    }
}
