import java.util.Random;
public class Lotto {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Random r1 = new Random();

            System.out.println(r1.nextInt(35 ) +1);
        }

        Random r2 = new Random(17);
        System.out.println(r2.nextInt(35) +1);

    }
}
