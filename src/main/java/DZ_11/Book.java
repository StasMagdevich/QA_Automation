package DZ_11;

public class Book extends Product {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author!=null) {
            this.author = author;
        }else {
            System.out.println("ERROR: поле author не может быть NULL");
        }
    }


    public Book(String name, String author, double price) {
        super(name, price);
        setAuthor(author);

    }
}