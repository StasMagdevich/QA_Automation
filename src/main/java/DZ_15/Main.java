package DZ_15;

public class Main {
    public static void main(String[] args) {
        boolean isValid = ExceptionsMethods.signUPMethod("s_magdevich", "123_!", "123_!");
        if (isValid == true) {
            System.out.println("login & password are valid");
        } else {
            System.out.println("login & password are NOT valid");
        }
    }
}
