import java.util.Scanner;

public class TestAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of test scores per student: ");
        int numTests = scanner.nextInt();

        for (int student = 1; student <= numStudents; student++) {
            double totalScore = 0;

            for (int test = 1; test <= numTests; test++) {
                System.out.print("Enter test score " + test + " for student " + student + ": ");
                double score = scanner.nextDouble();
                totalScore += score;
            }

            double averageScore = totalScore / numTests;

            System.out.println("Average test score for student " + student + ": " + averageScore);
        }

        scanner.close();
    }
}

