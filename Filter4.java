import java.util.*;
class FilterDemo
{
    int id;
    String name;
    double price;
    FilterDemo(int id,String name,double price)
    {
        this .id=id;
        this. name=name;
        this.price=price ;
    }

}


public class Filter4 {

    public static void main(String[] args) {

        List<FilterDemo> productsList = new ArrayList<FilterDemo>();

        productsList.add(new FilterDemo(1, "HP Laptop", 25000));
        productsList.add(new FilterDemo(2, "Dell Laptop", 30000));

        productsList.add(new FilterDemo(3, "Lenova Laptop", 28000));
        productsList.add(new FilterDemo(4, "Sony Laptop", 23000));

        productsList.add(new FilterDemo(4, "Apple Laptop", 90000));

        productsList.stream()

                .filter(p -> p.price > 25003)

                .forEach(pr -> System.out.println(pr.price));
    }
}