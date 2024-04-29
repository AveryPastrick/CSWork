import java.util.Random;
import java.util.Scanner;

public class MovieSimulationFour {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random(); // Made Random static as well

    public static void main(String[] args) {

        String[] movieNames = {"ExMachina", "Matrix", "Otherlife", "Oppenheimer"};
        String[] movieTypes = {"2D", "3D", "2D", "Drama/Historical"};
        double[] moviePrice = {15.25, 20.15, 18.11, 14.14};

        // Constants
        final int ROWS = 5;
        final int COLUMNS = 10;


        int[][] movieAvailability = new int[ROWS][COLUMNS];


        displayMovieDetails(movieNames, movieTypes, moviePrice);
        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrice[index]);
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        selectSeats(movieAvailability);
        scanner.close();
    }

    private static void displaySeatAvailability(int[][] movieAvailability) {
        System.out.println("\nSeating Availability: [ 1 = unavailable ; 0 = available ]\n");
        char[] rowLabel = {'A','B','C','D','E'};
        for(int c = 1; c <= movieAvailability[0].length;c++){
            System.out.printf(" %d",c);
        }
        System.out.printf("\n  %s\n","-".repeat(20));

        for(int i = 0 ; i <movieAvailability.length ; i++ )
        {
            System.out.printf("%c |",rowLabel[i]);
            for(int j = 0 ; j < movieAvailability[i].length ; j++)
            {
                System.out.print(movieAvailability[i][j] + " " );
            }
            System.out.println();
        }
    }

    private static void randomizeAvailability(int[][] movieAvailability) {
        System.out.println("\n------------ RANDOMIZED SEATS -----------\n");
        Random rand = new Random();
        // for(initialize; condition; increment/decrement)
        for (int i = 0; i < movieAvailability.length; i++) {
            for (int j = 0; j < movieAvailability[i].length; j++) {
                movieAvailability[i][j] = rand.nextInt(2);
            }
        }
    }

    static void selectSeats(int[][] movieAvailability) {
        System.out.println("\n------------ Seat Selection -----------\n");
        System.out.println("Enter the number of tickets you would like to purchase:");
        int numTickets = scanner.nextInt();

        for (int ticket = 0; ticket < numTickets; ticket++) {
            System.out.println("Enter the seat you want to book (e.g., A2, B5, C4, etc.):");
            boolean booked = false;
            while (!booked) {
                String seat = scanner.next().toUpperCase();
                int row = seat.charAt(0) - 'A';
                int column = Integer.parseInt(seat.substring(1)) - 1;

                if (row >= 0 && row < movieAvailability.length && column >= 0 && column < movieAvailability[row].length) {
                    if (movieAvailability[row][column] == 1) {
                        System.out.println("Seat " + seat + " is already booked. Please pick another seat.");
                    } else {
                        System.out.println("Seat " + seat + " booked successfully!");
                        movieAvailability[row][column] = 1;
                        booked = true;
                    }
                } else {
                    System.out.println("Invalid seat selection. Please try again.");
                }
            }
        }
        System.out.println("All seats have been booked.");
    }

    static void displayMovieDetails(String[] mNames, String[] mTypes, double[] mPrice) {
        String header = String.format("\n --------------------------- Movie Details --------------------------\n" +
                "%-20s %-20s%-20s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.println(header);
        for (int i = 0; i < mNames.length; i++) {
            System.out.printf("Movie %d : %-16s %-16s $%-16.2f\n", (i + 1), mNames[i], mTypes[i], mPrice[i]);
        }
    }

    static int selectMovie(String[] movieNames) {
        System.out.println("\nEnter the movie name you are purchasing tickets for:");
        while (true) {
            String selectedMovie = scanner.nextLine();
            for (int i = 0; i < movieNames.length; i++) {
                if (selectedMovie.equalsIgnoreCase(movieNames[i])) {
                    return i;
                }
            }
            System.out.println("Movie not found. Please try again.\n");
        }
    }

    static void displaySelectedMovie(String movieName, String movieType, double moviePrice) {
        System.out.printf("\n%s MOVIE SELECTIONS %s\n", "-".repeat(20), "-".repeat(20));
        System.out.printf("%-20s %-20s%-20s\n", "Movie Name", "Movie Type", "Movie Price");
        System.out.printf("%-25s%-20s$%.2f\n", movieName, movieType, moviePrice);
    }
}

