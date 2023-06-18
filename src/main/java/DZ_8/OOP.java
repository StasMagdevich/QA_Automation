package DZ_8;

public class OOP {

    public static void main(String[] args) {

        Lake lake1 = new Lake("река");
        Lake lake2 = new Lake("болото");

        Frog frog1 = new Frog("Квакушка", 5, "коричневый",lake1);
        Frog frog2 = new Frog("Царевна", 15, "зеленый", lake2);


        frog2.frogInfo();
        frog1.eat("мух");
        frog1.talk();

    }

}
