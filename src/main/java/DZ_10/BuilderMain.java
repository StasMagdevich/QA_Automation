package DZ_10;

public class BuilderMain {

    public static void main(String[] args) {
        //    Немного билдера)
//    Дано два числа, например 3 и 56, необходимо составить следующие строки:
//            3 + 56 = 59
//            3 – 56 = -53
//            3 * 56 = 168.
//    Используем метод StringBuilder.append().

        int i = 3;
        int b = 56;
        StringBuilder obj = new StringBuilder();
        System.out.println(obj.append(i).append("+").append(b).append("=").append(i + b));
        obj.setLength(0);
        System.out.println(obj.append(i).append("-").append(b).append("=").append(i - b));
        obj.setLength(0);
        System.out.println(obj.append(i).append("*").append(b).append("=").append(i * b));
//        Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().

        int index = obj.indexOf("=");
        obj.deleteCharAt(index);
        System.out.println(obj.insert(index, "равно"));

        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        System.out.println(obj.replace(4, 9, "РАВНО"));

    }

}
