import java.util.Random;
import java.util.Scanner;

public class MovieSimulationThree {
    static String[] movieNames = {"Jumanji", "Matrix", "Star Wars", "Oppenheimer"};
    static String[] movieTypes = {"2D", "3D", "2D", "Drama/Historical"};
    static double[] moviePrices = {15.29, 20.15, 18.11, 22.12};
    static int[][] movieAvailability = new int[5][10];

    public static void main(String[] args) {
        displayMovieDetails();

        int index = selectMovie();

        displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);
        
        randomizeAvailability();
        displaySeatAvailability();
    }

    public static void displayMovieDetails() {
        System.out.println("----------Movie Showcase----------");
        System.out.println("\nMovie Name      Movie Type      Movie Price");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("%-15s %-15s $%.2f\n", movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }

    public static int selectMovie() {
        Scanner scanner = new Scanner(System.in);
        String selectedMovie;
        int index = -1;
        boolean found = false;

        while (!found) {
            System.out.print("Enter the movie you would like to select: ");
            selectedMovie = scanner.nextLine();

            for (int i = 0; i < movieNames.length; i++) {
                if (selectedMovie.equalsIgnoreCase(movieNames[i])) {
                    index = i;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Movie not found. Try again.");
            }
        }

        return index;
    }

    public static void displaySelectedMovie(String name, String type, double price) {
        System.out.println("\n------------Movie Selection------------");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
    }

    public static void randomizeAvailability() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                movieAvailability[i][j] = random.nextInt(2); // 0 or 1
            }
        }
    }

    public static void displaySeatAvailability() {
        System.out.println("\n--------Available Seats--------");
        System.out.println("\nSeating Availability: [1 = Unavailable, 0 = Available]");
        System.out.println("\n  1 2 3 4 5 6 7 8 9 10");
        System.out.println("  --------------------");
        char row = 'A';
        for (int i = 0; i < 5; i++) {
            System.out.print(row + " |" );
            for (int j = 0; j < 10; j++) {
                System.out.print(movieAvailability[i][j] + " ");
            }
            row++;
            System.out.println();
        }
    }
}

