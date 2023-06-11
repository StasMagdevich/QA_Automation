package DZ_6;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {

//        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//        отделяя один элемент от другого пробелом,
//        а затем в столбик (отделяя один элемент от другого началом новой строки).
//        Перед созданием массива подумайте, какого он будет размера.
//
//        2 4 6 … 18 20

        int array[] = new int[10];
        int k = 0, j = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = k += 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[i] = j += 2;
            System.out.println(array[i]);
        }
        System.out.println("-----------------------");

//        Задача 2.
//        Создайте массив из всех нечётных чисел от 1 до 99,
//        выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
//        но в обратном порядке (99 97 95 93 …7 5 3 1).

        int number = 1;
        int[] array2 = new int[50];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = number;
            number += 2;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n" + "-----------------------");

//        Задача 3.(со звездочкой)
//        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//        выведите массивы на экран в двух отдельных строках.
//        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//        для какого из массивов это значение оказалось больше
//        (либо сообщите, что их средние арифметические равны).

        int[] array3 = new int[5];
        int[] array4 = new int[5];
        Random random = new Random();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            array3[i] = random.nextInt(5);
            sum1 += array3[i];
            array4[i] = random.nextInt(5);
            sum2 += array4[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }

        double average1;
        double average2;

        System.out.println();
        average1 = sum1 / array3.length;
        average2 = sum2 / array4.length;
        System.out.println();

        if (average1 > average2) {
            System.out.println("средне арифметическое значение элементов массива array3 больше массива array4");
        } else if (average1 < average2) {
            System.out.println("средне арифметическое значение элементов массива array3 меньше массива array4");
        } else {
            System.out.println("средне арифметическое  значение массивов равны");
        }
        System.out.println("\n"+"---------The End------------");


    }//main

}
