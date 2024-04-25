
import java.io.*;

class Instance
{


    public String str;
    public int i;
    public Integer p;
    public Instance()
    {

        this.str = "Rutuja"; // initializing Instance Variable

    }


    public static void main(String[] args)
    {

        Instance name = new Instance();


        System.out.println("string name is: " + name.str);
        System.out.println("Default value for int is "
                + name.i);


        System.out.println("Default value for Integer is "
                + name.p);
    }
}

