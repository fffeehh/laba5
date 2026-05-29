import java.util.regex.*;

public class CamelCaseFinder {
    public static void main(String[] args) {
        String text = "AaaaAaaa AaaaAaaaAaaaA";

        try {
            if (text == null) throw new Exception("Текст пуст");

            // Поиск мест, где строчная буква стоит перед заглавной (camelCase)
            Pattern pattern = Pattern.compile("([a-z])([A-Z])");
            Matcher matcher = pattern.matcher(text);

            // Выделение найденных переходов восклицательными знаками
            String result = matcher.replaceAll("!$1$2!");
            
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
