// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int intA = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int intB = scanner.nextInt();

        boolean result = equalCheck.exactEqual(intA, intB);
        System.out.println("Are the integers equal? " + result);

        scanner.close();
    }
}
