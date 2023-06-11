package DZ_5;

import java.util.Scanner;

public class Cycles {

    public static void main(String[] args) {

//        Задача 1.
//        Создайте программу, выводящую на экран все четырёхзначные
//        числа последовательности 1000 1003 1006 1009 1012 1015

        int start = 1000;
        int end = 9999;
        for (int x = start; x <= end; x = x + 3) {
            System.out.println(x);
        }
        System.out.println("-----------------------------");

//        Задача 2.
//        Создайте программу, выводящую на экран
//        все неотрицательные элементы последовательности
//        10, 6, 2,-2,-6,-10

        int x = 10;
        while (x >= -10) {
            if (x >= 0) {
                System.out.println(x);
            }
            x -= 4;
        }
        System.out.println("-----------------------------");

//        Задача 3.
//        Создайте программу, вычисляющую факториал натурального числа n,
//        которое пользователь введёт с клавиатуры.
//                https://javarush.ru/groups/posts/klass-scanner
//        Факториал числа n — это произведение натуральных чисел от 1 до n.
//        Обозначается n, произносится «эн-факториал».Например !3 = 1*2*3

        Scanner scanner = new Scanner(System.in);
        System.out.println("введи натуральное число: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("result = " + factorial);

//        Задача 4.
//        Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//        (заранее не известно сколько цифр будет в числе).

        Scanner scan = new Scanner(System.in);
        System.out.println("введи натуральное число: ");
        int number = scan.nextInt();
        int result = 0;
        while (number != 0) {

            int digit = number % 10;
            result += digit;
            number /= 10;
        }
        System.out.println("сумму всех его цифр = " + result);

        scanner.close();
        scan.close();

    }//main
}
