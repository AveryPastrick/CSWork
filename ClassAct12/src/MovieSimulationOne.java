import java.util.Scanner;

public class MovieSimulationOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of movies: ");
        int numMovies = scanner.nextInt();
        scanner.nextLine();

        String[] movieNames = new String[numMovies];
        String[] movieTypes = new String[numMovies];
        int[] availableSeats = new int[numMovies];
        double[] moviePrices = new double[numMovies];

        for (int i = 0; i < numMovies; i++) {
            System.out.println("\nEnter details for movie " + (i + 1) + ":");
            System.out.print("Name: ");
            movieNames[i] = scanner.nextLine();
            System.out.print("Type: ");
            movieTypes[i] = scanner.nextLine();
            System.out.print("Available Seats: ");
            availableSeats[i] = scanner.nextInt();
            System.out.print("Price: ");
            moviePrices[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
        }

        outputMovieDetails(movieNames, movieTypes, availableSeats, moviePrices);
    }
    public static void outputMovieDetails(String[] names, String[] types, int[] availableSeats, double[] prices) {
        System.out.println("\nMovie Details:");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Movie %d \n", i + 1);
            System.out.printf("Name: %s\n", names[i]);
            System.out.printf("Type: %s\n", types[i]);
            System.out.printf("Available Seats: %d\n", availableSeats[i]);
            System.out.printf("Price: $%.2f\n1", prices[i]);
            System.out.println();
        }
    }
}

