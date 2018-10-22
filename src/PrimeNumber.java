import java.util.Random;

public class PrimeNumber {

    public static void main(String[] args) {
        Random random = new Random(1000);
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            if (count == 50) {
                break;
            } else {
                System.out.println(random.nextInt(100));
            }

        }
    }
}
