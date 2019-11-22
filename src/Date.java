import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Date {
    public static void main(String[] args) {
DateTimeFormatter idag = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime nu = LocalDateTime.now();
        System.out.println(idag.format(nu));

    }
}
