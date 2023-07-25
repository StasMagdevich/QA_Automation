package DZ_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {

    private List<Product> productList;

    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    //Вернуть все имена продуктов
    public List<String> getAllProductName() {
        List<String> names = new ArrayList<>();
        for (Product product : productList) {
            names.add(product.getName());
        }
        return names;
    }

    //Вернуть все имена по алфавиту
    public List<String> getAllProductSortedByName() {
        List<String> names = getAllProductName();
        Collections.sort(names);
        return names;
    }

    //Вернуть все цены больше 10
    public List<Double> getAllProductByHigherPrice() {
        List<Double> price = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() > 10) {
                price.add(product.getPrice());
            }
        }
        return price;
    }

    // Вернуть все цены меньше 5
    public List<Double> getAllProductByLowerPrice() {
        List<Double> price = new ArrayList<>();
        for (Product product : productList) {
            if (product.getPrice() < 5) {
                price.add(product.getPrice());
            }
        }
        return price;
    }

    // Вернуть цены как строку
    public String getAllPricesAsString() {
        List<String> prices = new ArrayList<>();
        for (Product product : productList) {
            prices.add(String.valueOf(product.getPrice()));
        }
        return String.join(" ", prices);
    }

    public List<Product>sortProductByPrice(){
        List<Product>products = new ArrayList<>(productList);
        Collections.sort(products);
        return products;
    }

}
