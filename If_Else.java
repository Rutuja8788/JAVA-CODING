import java.util.*;

class If_Else
{
    public static void main(String[] args)
    {
     Scanner sn=new Scanner(System.in);
      int number=sn.nextInt();





        if (number > 0) {
            System.out.println("The number is positive.");
        }


        else if (number < 0) {
            System.out.println("The number is negative.");
        }


        else {
            System.out.println("The number is 0.");
        }
    }
}