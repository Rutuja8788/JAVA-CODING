import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args)
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1->addition\n2->subtraction\n3->multiplication\n4->division\n");
        int n = sn.nextInt();
        System.out.println("Enter any two numbers:");
        int a = sn.nextInt();
        int b = sn.nextInt();


        switch (n) {
            case 1:
                System.out.println("Result of addition: " + (a + b));
                break;
            case 2:
                System.out.println("Result of subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Result of multiplication: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result of division: " + ((double) a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}
