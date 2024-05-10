
package day13;
import java.util.Scanner;
public class ProductInput
{

        public static Product getProductDetailsFromUser()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product id: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            float price = scanner.nextFloat();
            return new Product(id, name, price);
        }
    }