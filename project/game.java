import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            int computer = random.nextInt(3) + 1; // 1 to 3

            System.out.print("Enter user choice (1-Rock, 2-Paper, 3-Scissors): ");
            int user = sc.nextInt();

            if (user < 1 || user > 3) {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("User chose: " + choices[user - 1]);
            System.out.println("Computer chose: " + choices[computer - 1]);

            if (computer == user) {
                System.out.println("Tie");
            } else if (computer == 1 && user == 2 ||
                       computer == 2 && user == 3 ||
                       computer == 3 && user == 1) {
                System.out.println("User won and computer lost");
            } else {
                System.out.println("User lost and computer won");
            }

            System.out.print("Play again? (y/n): ");
            String playAgain = sc.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
