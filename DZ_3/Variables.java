package DZ_3;

public class Variables {


    public static void main(String[] args) {
        byte b = 100;
        System.out.println(b);
        short sh = 10000;
        System.out.println(sh);
        int i = 10000000;
        System.out.println(i);
        long l = 9223372036854775807L;
        System.out.println(l);
        float fl = 5.123456F;
        System.out.println(fl);
        double d = 9.1234567890123456; // почему здесь не нужно добавлять приставку D как в примере с float/long?
        System.out.println(d);
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);
        char ch = 'C';
        System.out.println(ch);
 //---------------------------------------------

        int sum = b + sh;
        System.out.println(sum);
        int diff = sh - b;
        System.out.println(diff);
        long mult = (long) sh * i;
        System.out.println(mult);
        double div = d/fl;
        System.out.println(div);


    }//main
}
