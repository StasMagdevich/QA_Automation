package DZ_11;

class Electronics extends Product {
    private String type;

    public String getType(){
        return type;
    }

    public Electronics(String type, String name, double price) {
        super(name, price);
        this.type = type;
    }
}
