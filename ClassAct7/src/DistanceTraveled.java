import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed in mph: ");
        double speed = scanner.nextDouble();

        System.out.print("Enter time spent traveling in hours: ");
        int time = scanner.nextInt();

        System.out.println("Hour  |  Distance Traveled");
        System.out.println("------------------------");

        for (int hour = 1; hour <= time; hour++) {
            double distance = speed * hour;
            System.out.printf("%-5d |  %-18.2f\n", hour, distance);
        }

        scanner.close();
    }
}

