public class Overloading
{

    void show(int num1)
    {
        System.out.println("number 1 : " + num1);
    }

    void show(int num1, int num2)
    {
        System.out.println("number 1 : " + num1
                + "  number 2 : " + num2);
    }

    public static void main(String[] args)
    {
        Overloading obj = new Overloading();
        obj.show(3);
        obj.show(4, 5);
    }
}
