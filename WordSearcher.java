import java.util.regex.*;

public class WordSearcher {
    public static void main(String[] args) {
        String text = "Apple banana Apricot orange avocado";
        char targetLetter = 'a';

        try {
            if (text == null) throw new Exception("Текст отсутствует");

            // Формируем regex для поиска слов на заданную букву (игнорируя регистр)
            String regex = String.format("\\b[%c%C][a-zA-Z]*\\b", targetLetter, targetLetter);
            
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Слова на букву " + targetLetter + ":");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
