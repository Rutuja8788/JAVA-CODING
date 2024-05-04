interface API
{

    default void show()
    {
        System.out.println("Default API");
    }
}
interface Interface1 extends API
{

    void display();
}

interface Interface2 extends API
{

    void print();
}

class Multiple1 implements Interface1, Interface2
{

    public void display()
    {
        System.out.println("Display from Interface1");
    }

    public void print()
    {
        System.out.println("Print from Interface2");
    }
    // Main driver method
    public static void main(String args[])
    {
        Multiple1 d = new Multiple1();
        d.show();
        d.display();
        d.print();
    }
}


