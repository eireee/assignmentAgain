import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1; // 1 to 100
        System.out.println("Random number: " + randomNum);
    }
}
