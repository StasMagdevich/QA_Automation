package DZ_12;

class Electronics extends Product {
    private String name;

    public String getName() {
        return name;
    }

    public Electronics(String productType, String name, double price, int quantity) {
        super(productType, price, quantity);
        this.name = name;
    }


    @Override
    public void purchaseProduct(int quantity) {
        if (this.getQuantity() < quantity) {
            System.out.println("недостаточно товара на складе");
        } else
            setQuantity(getQuantity() - quantity);

    }

    @Override
    public String toString() {
        return "productInfo {" +
                "\n" + "тип товара: '" + getProductType() + "" + '\'' +
                "\n" + "производитель: '" + getName() + '\'' +
                "\n" + "цена: '" + getPrice() + "$" + '\'' +
                "\n" + "остаток на складе: '" + getQuantity() + '\'' +
                "\n" + '}' + "\n---------------";
    }
}
