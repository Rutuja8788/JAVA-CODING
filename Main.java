import day13.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> productsList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an option:");
        System.out.println("1. Add product details");
        System.out.println("2. Filter products with price greater than 3000 and display names");
        System.out.println("3->method of stream min ,max,sorted,reduce etc");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                addProductDetails();
                break;
            case 2:
                displayProductNamesGreaterThan3000();
                break;
            case 3:
                MethodStream.streammethod();
                break;

            default:
                System.out.println("Invalid option.");
        }
    }

    private static void addProductDetails() {
        for (int i = 0; i < 5; i++) {
            Product product = ProductInput.getProductDetailsFromUser();
            productsList.add(product);
        }
        System.out.println("Product details added successfully.");
    }

    private static void displayProductNamesGreaterThan3000() {
        List<String> productNames = new ArrayList<>();
        for (Product product : productsList) {
            if (product.price > 3000) {
                productNames.add(product.name);
            }
        }
        System.out.println("Product names with price greater than 3000:");
        for (String name : productNames) {
            System.out.println(name);
        }
    }
}
