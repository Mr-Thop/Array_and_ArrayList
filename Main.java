/*
 * Name: Karne Karthikeshwar Reddy
 * PRN: 23070126055
 * Batch: 2023-2027
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Choose an operation:");
        System.out.println("1. Separate even and odd numbers");
        System.out.println("2. Find smallest distance pair");
        System.out.println("3. Convert between Array and ArrayList");
        System.out.println("4. Exit");
        
        int choice = scan.nextInt();
        switch (choice) {
            case 1 -> EvenOddSeparator.processNumbers();
            case 2 -> SmallestDistanceFinder.findSmallestDistance();
            case 3 -> ArrayConverter.convertArrayAndArrayList();
            case 4 -> System.out.println("Exiting...");
            default -> System.out.println("Invalid choice!");
        }
        scan.close();
    }

}