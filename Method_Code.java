public class Method_Code
{


    private int number;
    private String name;


    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }


    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void printDetails()
    {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
    }


public static void main(String s[])
{
    Method_Code example = new Method_Code();
    example.setNumber(123);
   example.setName("GFG Write");
  example.printDetails();
  }
 }
