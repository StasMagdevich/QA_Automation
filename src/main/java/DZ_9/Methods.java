package DZ_9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Methods {


//    1. Практика методов класса String
//    Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.

    public static void inputString(String str) {
        System.out.println(str);
    }

    //    Распечатать последний символ строки. Используем метод String.charAt().
    public static void printLastCharacter(String str) {
        int lastIndex = str.length() - 1;
        char result = str.charAt(lastIndex);
        System.out.println(result);
    }

    //    Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
    public static void checkStringEnd(String str) {
        if (str.endsWith("!!!")) {
            System.out.println("строка заканчивается подстрокой “!!!”");
        } else {
            System.out.println("строка НЕ заканчивается");
        }
    }

    //    Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
    public static void checkStringStart(String str) {
        if (str.startsWith("I like")) {
            System.out.println("Да, строка начинается подстрокой “I like”");
        } else {
            System.out.println("Нет, строка НЕ начинается подстрокой “I like”");
        }
    }

    //    Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    public static void checkStringContain(String str) {
        boolean result = str.contains("Java");
        if (result) {
            System.out.println("Cтрока содержит подстроку “Java”");
        } else {
            System.out.println("Нет, не содержит");
        }
    }

    //    Найти позицию подстроки “Java” в строке “I like Java!!!”.
    public static void findInString(String str) {
        int position = str.indexOf("Java");
        System.out.println(position);
    }

    //    Заменить все символы “а” на “о”.
    public static void replace(String str) {
        String result = str.replace('a', 'o');
        System.out.println(result);
    }

    //    Преобразуйте строку к верхнему регистру.
    public static void stringToUperCase(String str) {
        System.out.println(str.toUpperCase());
    }

    //    Преобразуйте строку к нижнему регистру.
    public static void stringToLowerCase(String str) {
        System.out.println(str.toLowerCase());
    }

    //    Вырезать строку Java c помощью метода String.substring().
    public static void cutString(String str) {
        int position = str.indexOf("Java");
        int position2 = position + "Java".length();
        String result = str.substring(0, position) + str.substring(position2);
        System.out.println(result);
    }


//    2. Список студентов
//    Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
//    Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию, оценку и название предмета в качестве параметров.
//    Выделить под фамилию 15 символов, под оценку 3 символа, под предмет – 10.
//
//    Пример вывода:
//
//    Студент Иванов            получил 5   по Математике
//
//    Студент Петрова         получил 4   по Физике
//
//    Студент Сидорова        получил 3   по Программированию


    public static void printStudent(String lastName, int mark, String subject) {
        if (lastName.length() <= 15 & Integer.toString(mark).length() <= 3 & subject.length() <= 10) {
            String result = String.format("Студент %s получил %d по %s", lastName, mark, subject);
            System.out.println(result);
        } else {
            System.out.println("какой-то из параметров не соответствует условию");
        }

    }


//    3.Слово с минимальным числом символов
//    Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
//    Если таких слов несколько, найти первое из них.
//            Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".

    public static String findWordWithMinLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        if (input == null || input.isEmpty()) {
            return "";
        }

        String[] words = input.split("\\s+");
        String minWord = null;
        int minLetters = Integer.MAX_VALUE;

        for (String word : words) {
            int uniqueChars = countUniqueCharacters(word);
            if (uniqueChars < minLetters) {
                minLetters = uniqueChars;
                minWord = word;
            }
        }

        return minWord;
    }

    private static int countUniqueCharacters(String word) {
        Set<Character> charSet = new HashSet<>();
        for (char c : word.toCharArray()) {
            charSet.add(c);
        }
        return charSet.size();
    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        inputString(str);
        printLastCharacter(str);
        checkStringEnd(str);
        checkStringStart(str);
        checkStringContain(str);
        findInString(str);
        replace(str);
        stringToUperCase(str);
        stringToLowerCase(str);
        cutString(str);
        printStudent("Иванов", 5, "Математике");
        printStudent("Петрова", 4, "Физике");
        printStudent("Сидорова", 3, "Программированию");
        String result = findWordWithMinLetters();
        System.out.println("Слово с минимальным числом символов: " + result);
    }

}
