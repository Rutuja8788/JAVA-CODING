abstract class Base {


    Base()
    {
        System.out.println("Base Constructor Called");
    }

    abstract void fun();
}

class Derived extends Base {

    Derived()
    {
        System.out.println("Derived Constructor Called");
    }

    // Method of class2
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}


class GFG
{
    public static void main(String args[])
    {

        Derived d = new Derived();
        d.fun();
    }
}