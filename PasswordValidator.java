import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "Sj39DF523kfD";

        try {
            if (password == null) throw new Exception("Пароль не может быть null");

            // Проверка: 8-16 символов, минимум 1 заглавная буква и 1 цифра, только латиница и цифры
            String regex = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{8,16}$";
            
            if (Pattern.matches(regex, password)) {
                System.out.println("Пароль корректен");
            } else {
                System.out.println("Пароль некорректен");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
