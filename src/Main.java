import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(100);
        Scanner sc =new Scanner(System.in);
        while (true) {
            System.out.println("Guesss the number");
            int guessNumber = sc.nextInt();
            if (guessNumber < hiddenNumber) {
                System.out.println("more");
            } else if (guessNumber > hiddenNumber) {
                System.out.println("less");
            } else {
                System.out.println("You guessed");
                break;
            }
        }
    }
}
