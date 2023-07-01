package DZ_12;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Книга", "Стивен Кинг", 7.99, 44);
        Electronics electronics = new Electronics("TV", "Samsung", 899.99, 27);

        book.purchaseProduct(12);
        //System.out.println(book.getQuantity());
        System.out.println(book);
        System.out.println(electronics);
    }
}
