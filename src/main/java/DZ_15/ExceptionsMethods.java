package DZ_15;

public class ExceptionsMethods {

    public static boolean signUPMethod(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!login.contains("_")) {
            throw new WrongLoginException("Login олжен содержать знак подчеркивания");
        }

        if (login.length() >= 20) {
            throw new WrongLoginException("Длина login должна быть меньше 20 символов");
        }
    }

    public static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.contains("_") || !password.contains("!")) {
            throw new WrongPasswordException("Password должен содержать знак _ и !");
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("password и confirmPassword должны быть равны");
        }

    }
}
