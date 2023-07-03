package DZ_12;

public abstract class Product {
    private String productType;
    private double price;

    private int quantity;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("введено неверное значение для товара: " + getProductType());
        } else
            this.quantity = quantity;
    }

    public Product(String productType, double price, int quantity) {
        this.productType = productType;
        setPrice(price);
        setQuantity(quantity);
    }

    public abstract void purchaseProduct(int quantity);
}
