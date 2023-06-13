package DZ_7;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        int x = Methods.getInt(scanner1);

        Scanner scanner2 = new Scanner(System.in);
        int y = Methods.getInt(scanner2);

        Scanner scanner3 = new Scanner(System.in);
        char action = Methods.getOperation(scanner3);


        int result = Methods.calc(x, y, action);

        System.out.println("Результат: " + result);

        scanner1.close();
        scanner2.close();
        scanner3.close();

    }//main

}
