import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price of the product is $19.99. The weight is 5.5 kg and discount is 10.";

        try {
            // Регулярное выражение для поиска целых и дробных чисел
            Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
            Matcher matcher = pattern.matcher(text);

            System.out.println("Найденные числа:");

            // Поиск и вывод всех совпадений в строке
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (NullPointerException e) {
            System.err.println("Ошибка: текст не задан.");
        } catch (Exception e) {
            System.err.println("Произошла ошибка при поиске чисел: " + e.getMessage());
        }
    }
}
