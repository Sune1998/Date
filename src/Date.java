import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
DateTimeFormatter idag = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime nu = LocalDateTime.now();
        System.out.println(idag.format(nu));

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 160);
        java.util.Date futerdatetime = calendar.getTime();
        System.out.println(futerdatetime);
    }
}
