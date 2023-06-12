package DZ_7;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int x = Methods.getInt(scanner);
//        //System.out.println(x);

        Scanner scanner1 = new Scanner(System.in);
//        String action = Methods.getOperation(scanner1);
//       // System.out.println(action);

        int result= Methods.calc(Methods.getInt(scanner),Methods.getInt(scanner),Methods.getOperation(scanner1));

        System.out.println("Результат: " + result);

        scanner.close();
        scanner1.close();
    }//main


}
