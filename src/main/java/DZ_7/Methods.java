package DZ_7;

import java.util.Scanner;

public class Methods {

    //        Метод int getInt() - должен считывать с консоли целое число и возвращать его
    public static int getInt(Scanner scanner) {
        System.out.println("Веедите целое число:");
        return scanner.nextInt();
    }//getInt
    //        Метод char getOperation() - должен считывать с консоли какое-то значение

    public static char getOperation(Scanner scanner) {
        System.out.println("Введите действие (+, -, * или /): ");
        return scanner.next().charAt(0);
    }

//        Метод int calc(int num1, int num2, char operation)
//        - должен выполнять над числами num1 и num2 арифметическую операцию,
//        заданную operation.
//        Метод main() - должен считывать 2 числа (с помощью getInt()),
//        считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат.

    public static int calc(int num1, int num2, char operation) {
        int result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("На ноль делить нельзя:" + "\n " + "https://uk.wikipedia.org/wiki/%D0%94%D1%96%D0%BB%D0%B5%D0%BD%D0%BD%D1%8F_%D0%BD%D0%B0_%D0%BD%D1%83%D0%BB%D1%8C");
                }
                break;
            default:
                System.out.println("что-то пошло не так, попробуйте снова");
        }

        return result;
    }

}
