public class InstanceCode implements Cloneable
{
    protected Object clone()
            throws CloneNotSupportedException
    {

        return super.clone();
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args)
    {
        InstanceCode  obj1 = new  InstanceCode ();


        try {


            InstanceCode obj2 = ( InstanceCode )obj1.clone();


            System.out.println(obj2.name);
        }


        catch (CloneNotSupportedException e) {


            e.printStackTrace();
        }
    }
}
