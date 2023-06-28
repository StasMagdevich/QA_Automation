package DZ_11;

public abstract class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0.1) {
            System.out.println("!!! ERROR !!! цена не может быть ниже 0.1$");
        } else {
            this.price = price;
        }
    }

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
    }
}
