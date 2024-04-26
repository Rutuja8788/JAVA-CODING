
import java.util.ArrayList;

public class BreakContinue
{
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);


        System.out.println("Printing numbers:");
        for (int num : numbers) {
            System.out.println(num);

            if (num > 5)
            {

                break;
            }
        }
        System.out.println("\nPrinting even numbers:");
        for (int num : numbers) {

            if (num % 2 != 0) {

                continue;
            }

            System.out.println(num);
        }
    }
}
