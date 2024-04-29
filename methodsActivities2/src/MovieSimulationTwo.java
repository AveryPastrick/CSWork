import java.util.Random;

public class MovieSimulationTwo {
    private static final int ROWS = 5;
    private static final int COLUMNS = 10;

    private static final String[] movieNames = {"Movie 1 :Apple!", "Movie 2 :Banana!?!", "Movie 3 :Radish.", "Movie 4:Lemon"};
    private static final String[] movieTypes = {"Action", "Comedy", "Drama", "Thriller"};
    private static final double[] moviePrices = {10.0, 12.0, 11.5, 9.5};
    private int[][] movieAvailability = new int[ROWS][COLUMNS];

    public static void main(String[] args) {
        MovieSimulationTwo simulation = new MovieSimulationTwo();
        simulation.displayMovieDetails(movieNames, movieTypes, moviePrices);
        simulation.setSeatAvailability();
        System.out.println("\n---------Initial Seats---------");
        simulation.displaySeatAvailability();
        simulation.randomizeAvailability();
        System.out.println("\n-------- Random Seats ---------");
        simulation.displaySeatAvailability();
    }
    private void setSeatAvailability() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                movieAvailability[i][j] = 0;
            }
        }
    }

    private void randomizeAvailability() {
        Random random = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                movieAvailability[i][j] = random.nextInt(2);
            }
        }
    }

    private void displayMovieDetails(String[] names, String[] types, double[] prices) {
        System.out.println("--------Movie Details--------");
        System.out.printf("%-20s %-15s %-10s\n", "Movie Name", "Type", "Price");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s %-15s $%-10.2f\n", names[i], types[i], prices[i]);
        }
    }

    private void displaySeatAvailability() {
        System.out.println("Seat Availability");
        System.out.println("1 = unavailable, 0 = available");
        for (int i = 0; i < ROWS; i++) {

            for (int j = 0; j < COLUMNS; j++) {
                if (movieAvailability[i][j] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

    }
}


