public class  NullPointer {

    public static void main(String[] args) {

        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(NullPointerException  e)
        {
            System.out.println("give some value");
        }
        System.out.println("rest of the code");
    }
}
