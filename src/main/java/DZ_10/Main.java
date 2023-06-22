package DZ_10;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Книга", "Стивен Кинг", 7.99);
        System.out.println("Тип товара: " + book.name + "\n" + " Автор: " + book.author + "\n" + " Цена: " + book.price + "$"
                + "\n-----------");
        Electronics el = new Electronics("TV", "Samsung", 899.99);
        System.out.println("Тип товара: " + el.type + "\n" + " Производитель: " + el.name + "\n" + " Цена: " + el.price + "$"
                + "\n-----------");
    }
}
