
public class Operator
{
    public static void main(String[] args)
    {

        int a = 10, b = 5;
        int add = a + b;
        int sub= a - b;
        int multi= a * b;
        int div= a / b;
        int mod = a % b;

        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + multi);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);


        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a equal to b? " + (a == b));


        int c = 10;
        c += 5;
        System.out.println("Value of c after using assignment operator: " + c);


        int count = 5;
        System.out.println("Original count: " + count);
        count++;
        System.out.println("Count after increment: " + count);
        count--; // decrement
        System.out.println("Count after decrement: " + count);
    }
}

