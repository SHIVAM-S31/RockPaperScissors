import java.util.Random;
import java.util.Scanner;

public class rockpaperscisssors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out
                    .println("Enter your move.Type in rock,paper and scissors.If you want to exit the game type quit");
            String mymove = sc.nextLine();
            if (mymove.equals("quit")) {
                break;
            }
            if ((!mymove.equals("rock")) && (!mymove.equals("paper")) && (!mymove.equals("scissors"))) {
                System.out.println("Your move isn't valid");
            } else {
                Random rand = new Random();
                int computer = rand.nextInt(2);
                String opponent = "";
                if (computer == 0) {
                    opponent = "rock";
                } else if (computer == 1) {
                    opponent = "paper";
                } else {
                    opponent = "scissors";
                }
                System.out.println("Opponent move: " + opponent);
                if (mymove.equals(opponent)) {
                    System.out.println("You tied");
                } else if ((mymove.equals("rock") && opponent.equals("scissors"))
                        || (mymove.equals("scissors") && opponent.equals("paper"))
                        || (mymove.equals("paper") && opponent.equals("rock"))) {
                    System.out.println("You won");

                } else {
                    System.out.println("You lost");
                }
            }

            System.out.println("Thanks for playing :)");
        }
        sc.close();
    }
}
