import java.util.Scanner;

public class ArrayFromInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[3];
        int[] ages = new int[3];
        double[] grades = new double[3];

        System.out.println("Enter names for three people:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nEnter ages for the three people:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nEnter grades for the three people:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }

        scanner.close();

        System.out.printf("%-15s%-10s%-10s\n", "Name", "Age", "Grade");
        System.out.println("-------------------------");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s%-10d%-10.2f\n", names[i], ages[i], grades[i]);
        }
    }
}

