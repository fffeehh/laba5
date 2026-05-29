import java.util.regex.*;

public class IPAddressValidator {
    public static void main(String[] args) {
        String ip = "192.168.1.255";

        try {
            if (ip == null) throw new Exception("IP не задан");

            // Регулярное выражение для проверки одного октета (от 0 до 255)
            String byteRegex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
            // Полное выражение: четыре октета, разделенные точками
            String ipRegex = "^" + byteRegex + "\\." + byteRegex + "\\." + byteRegex + "\\." + byteRegex + "$";

            if (Pattern.matches(ipRegex, ip)) {
                System.out.println("IP-адрес корректен.");
            } else {
                System.out.println("IP-адрес некорректен.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
