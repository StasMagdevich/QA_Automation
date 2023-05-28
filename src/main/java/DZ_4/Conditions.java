package DZ_4;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        double cm = 10;
        double inches = cm/2.54;
        System.out.println("10см = " + inches + "дм");
        inches = 25;
        cm = inches*2.54;
        System.out.println("25дм = " + cm + "см");

        System.out.println("-----------------------------");

//        Задача 2.
//        Подрабатывая в течение года, Вася собрал себе определенную сумму на поездку за границу,
//        а родители добавили ему от себя еще некоторую сумму.
//        Выведите в консоль сколько денег есть у Васи на отпуск (в евро) если:
//        Вася заработал 5000 грн,Родители добавили-5000,
//        курс евро 1 евро = 28 грню

        Scanner s = new Scanner(System.in);
        System.out.print("Введи заработанную сумму: " ) ;
        int a = s.nextInt();
        System.out.print("Введи сколько падарили: ");
        int b = s.nextInt();
        System.out.print("Введи курс евро к гривне: ");
        double exchange = s.nextDouble();
        double sum = (a+b)/exchange;
        System.out.println("Денег на отпуск: "+ sum + "EU");
        System.out.println("-------------------------------");
//
//        Задача 3.
//        Если x любое положительное двузначное число
//        Выведите на екран его десятки и еденицы (2 числа)
//        разделенные знаком «пробел», но в обратном порядке.
//        То есть для числа 45 будет выведено на экран 5 4.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное положительное число:");
        int x = sc.nextInt();
        if (x>9 && x<100 ){
            int ed = x % 10;
            int des = x / 10;
            System.out.println(ed + " " + des);
        }else {
            System.out.println("введеное число не соответствует условию ");
        }

        System.out.println("-------------------------------");

//        Задача 4.
//        Если x любое положительное двузначное число
//        Выведите на екран его в «полном виде»: например,
//        для числа 34 это будет выглядеть как 30+4.

        Scanner sca = new Scanner(System.in);
        System.out.println("Введите любое положительное двузначное число:");
        int X = sca.nextInt();
        if (X>9 && X<100 ){
            int des = X / 10;
            int ed = X % 10;
            System.out.println(des* 10 + "+" +  ed);
        }else  {
            System.out.println("введеное число не соответствует условию ");
        }

        System.out.println("-------------------------------");

//        Задача 5.
//        Назовем весом числа сумму его цифр.
//        Если x любое положительное двузначное число
//        Выведите на екран его «вес».

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите положительное двузначное число для вычисления веса: ");
        int k = scan.nextInt();
        if(k>9 && k<100){
            int des = k/10;
            int ed = k%10;
            int weight = des + ed;
            System.out.println("Вес = " + weight);
        }else {
            System.out.println("Введеное число не соответствует условию");
        }

        System.out.println("-------------------------------");

//        Задача 6.
//        Если x любое число,выведите на экран одно из следующих сообщений:
//        Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.

        Scanner scann =  new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scann.nextInt();
        if (number > 0 ){
            System.out.println("число положительное");
        }else if (number<0){
            System.out.println("число отрицательное");
        }else {
            System.out.println("число равно нулю");
        }

        System.out.println("-------------------------------");

//        Задача 7.
//        Если x любое число,
//        если оно как минимум трехзначное и положительное,
//                уменьшает его на 1 и выводит на экран.

        Scanner scanne = new Scanner(System.in);
        System.out.print("Введите любое число (минимум трехзначное и положительное): ");
        int value = scanne.nextInt();
        if (value>=100 ){
            value = value-1;
            System.out.println(value);
        }else {
            System.out.println("число не соответсвует условию");
        }

        System.out.println("-------------------------------");

//        Задача 8.
//        Если x любое положительное двузначное число выведите на экран что больше:
//        само это число или произведение его цифр.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое положительное двузначное число: ");
        int val = scanner.nextInt();
        if(val>9 & val<100){
            int des = val/10;
            int ed = val%10;
            int mult = des * ed;
            System.out.println(mult);
            if(mult>val){
                System.out.println("произведение цифр из числа" + val + "больше чем само число");
            }else {
                System.out.println("Число "+ val + " больше произведения его цифр");
            }
        }
        s.close();
        sc.close();
        sca.close();
        scan.close();
        scann.close();
        scanne.close();
        scanner.close();



    }//main

}
