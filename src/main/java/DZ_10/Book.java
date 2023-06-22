package DZ_10;

public class Book extends Product {
    String author;

    public Book(String name, String author, double price) {
        super(name, price);
        this.author = author;

    }
}