package DZ_8;

public class Frog {

    String name;
    int age;
    String color;

    Lake lake;

    public Frog(String name) {
        this.name = name;
    }

    public Frog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Frog(String name, int age, String color, Lake lake) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.lake = lake;
    }

    public void talk() {
        System.out.println("kvvaaaaa");
    }

    public void eat(String food) {
        System.out.println(name + " ест " + food);
    }

    public void frogInfo() {
        System.out.println("имя " + name + ", " + "возраст " + age + "лет, цвет - " + color + ", место жительства - "+ lake.printLake());
    }


}
