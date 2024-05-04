public class Nested_Try
{
    public static void main(String args[]){

        try
        {

            try{
                System.out.println("going to divide by 0");
                int b =39/0;
            }

            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception Should Occured");
            }

            try
            {
                int a[]=new int[5];


                a[5]=4;
            }

            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Index out of bound Exception");
            }

            String s=null;
            int a=s.length();
        }

        catch(Exception e)
        {
            System.out.println("NullPointr Exception");
        }

        System.out.println("normal flow..");
    }
}