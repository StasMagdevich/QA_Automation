package DZ_12;

public class Book extends Product {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null) {
            this.author = author;
        } else {
            System.out.println("ERROR: поле author не может быть NULL");
        }
    }


    public Book(String productType, String author, double price, int quantity) {
        super(productType, price, quantity);
        setAuthor(author);

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
                "\n" + "автор: '" + getAuthor() + '\'' +
                "\n" + "цена: '" + getPrice() + "$" + '\'' +
                "\n" + "остаток на складе: '" + getQuantity() + '\'' +
                "\n" + '}' + "\n---------------";
    }
}
