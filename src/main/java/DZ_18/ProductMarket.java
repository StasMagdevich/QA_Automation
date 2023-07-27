package DZ_18;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Product> productList;

    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    //Вернуть все имена продуктов
    public List<String> getAllProductNames() {
        return productList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    //Вернуть все имена по алфавиту
    public List<String> getAllProductSortedByName() {
        return productList.stream().
                map(Product::getName).
                sorted()
                .collect(Collectors.toList());
    }

    //Вернуть все цены больше 10
    public List<Double> getAllProductByHigherPrice() {
        return productList.stream().
                filter(product -> product.getPrice() > 10).
                map(Product::getPrice)
                .collect(Collectors.toList());
    }

    // Вернуть все цены меньше 0
    public List<Double> getAllProductByLowerPrice() {
        return productList.stream().
                filter(productList -> productList.getPrice() < 0).
                map(Product::getPrice).
                sorted().
                collect(Collectors.toList());
    }

    // Вернуть цены как строку
    public List<String> getAllPricesAsString() {
        return productList.stream()
                .map(p -> String.valueOf(p.getPrice()))
                .collect(Collectors.toList());
    }

}
