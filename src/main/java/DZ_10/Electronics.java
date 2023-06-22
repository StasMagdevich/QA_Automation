package DZ_10;

class Electronics extends Product {
    String type;

    public Electronics(String type, String name, double price) {
        super(name, price);
        this.type = type;
    }
}
