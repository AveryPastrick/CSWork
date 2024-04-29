import java.util.Scanner;
import java.util.Random;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds = 1;
        int P1Wins = 0;
        int P2Wins = 0;

        // Number of rounds
        System.out.println("Enter an odd number of rounds: ");
        int numRounds = scanner.nextInt();
        System.out.println("You entered: " + numRounds + " rounds.");

        scanner.nextLine();

        while (rounds <= numRounds) {
            // Asks player one for Stats
            int P1HP;
            int P1MovePow;
            int P1MoveSpeed;

            System.out.println("Round " + rounds + " : ");
            System.out.println("Player 1: Enter Character stats");

            System.out.println("Enter character's name: ");
            String P1Name = scanner.nextLine();

            System.out.print("Enter HP: ");
            P1HP = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter move name: ");
            String P1MoveName = scanner.nextLine();

            System.out.print("Enter move's power: ");
            P1MovePow = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter attack speed: ");
            P1MoveSpeed = scanner.nextInt();

            scanner.nextLine();

            // Asks player Two for Stats
            int P2HP;
            int P2MovePow;
            int P2MoveSpeed;

            System.out.println("Player 2: Enter Character stats");

            System.out.println("Enter character's name: ");
            String P2Name = scanner.nextLine();

            System.out.print("Enter HP: ");
            P2HP = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter move name: ");
            String P2MoveName = scanner.nextLine();

            System.out.print("Enter move's power: ");
            P2MovePow = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter attack speed: ");
            P2MoveSpeed = scanner.nextInt();

            scanner.nextLine();

            while (P1HP > 0 && P2HP > 0) {
                if (P1MoveSpeed > P2MoveSpeed) {
                    P2HP -= P1MovePow;
                } else if (P1MoveSpeed == P2MoveSpeed) {
                    int randomValue = random.nextInt(2);
                    if (randomValue == 0){
                        P1MoveSpeed++;
                    }else{
                        P2MoveSpeed++;
                        }
                } else {
                    P1HP -= P2MovePow;
                }
            }

            // Determine the round winner
            if (P1HP <= 0) {
                System.out.println("Player 2 wins the round!");
                P2Wins++;
            } else {
                System.out.println("Player 1 wins the round!");
                P1Wins++;
            }

            rounds++;
        }
        if(P1Wins > P2Wins){
            System.out.println("Player 1 wins overall!");
        }else{
            System.out.println("Player 2 wins overall!");
        }
    }
}


