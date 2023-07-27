package DZ_18;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> productList = List.of(new Product("сыр", 2.99),
        new Product("молоко", 2.99),
        new Product("хлеб", 0.99),
        new Product("творог", 6.99),
        new Product("сметана", 4.99),
        new Product("яблоко", 0.99),
        new Product("вино", 10.99));
        ProductMarket obj = new ProductMarket(productList);
        System.out.println(obj.getAllProductNames());
        System.out.println(obj.getAllProductSortedByName());
        System.out.println(obj.getAllProductByHigherPrice());
        System.out.println(obj.getAllProductByLowerPrice());
        System.out.println(obj.getAllPricesAsString());
    }
}