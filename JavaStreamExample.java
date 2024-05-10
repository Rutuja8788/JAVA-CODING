import day13.*;


import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Product product = ProductInput.getProductDetailsFromUser();
            productsList.add(product);
        }
        List<Float> productPriceList = new ArrayList<>();
        for (Product product : productsList) {

            if (product.price < 30000)
            {
                productPriceList.add(product.price);
            }
        }
        System.out.println(productPriceList);
    }
}

