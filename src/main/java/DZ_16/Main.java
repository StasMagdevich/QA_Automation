package DZ_16;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("молоко", 2.99));
        productList.add(new Product("хлеб", 0.99));
        productList.add(new Product("творог", 6.99));
        productList.add(new Product("сметана", 4.99));
        productList.add(new Product("яблоко", 0.99));
        productList.add(new Product("вино", 10.99));
        ProductMarket obj = new ProductMarket(productList);
        System.out.println(obj.getAllProductName());
        System.out.println(obj.getAllProductSortedByName());
        System.out.println(obj.getAllProductByHigherPrice());
        System.out.println(obj.getAllProductByLowerPrice());
        System.out.println(obj.getAllPricesAsString());
    }
}
