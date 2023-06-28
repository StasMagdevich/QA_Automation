package DZ_11;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Книга","Стивен Кинг",7.99);
        System.out.println("Тип товара: " + book.getName() + "\n" + " Автор: " + book.getAuthor() + "\n" + " Цена: " + book.getPrice() + "$"
                + "\n-----------");
        Electronics el = new Electronics("TV", "Samsung", 899.99);
        System.out.println("Тип товара: " + el.getType() + "\n" + " Производитель: " + el.getName() + "\n" + " Цена: " + el.getPrice() + "$"
                + "\n-----------");
    }
}
