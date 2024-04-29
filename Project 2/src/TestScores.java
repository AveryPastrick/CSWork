import java.util.Scanner;

public class TestScores {
    public static final int SIZE = (int) (Math.random() * 8) + 3;
    public static void main(String[] args) {
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of test scores to be entered: " + SIZE);

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter test score #" + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }
        for (int i = 0; i < SIZE; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);

        scanner.close();
    }

    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void printGrades(int[] scores, char[] grades) {
        System.out.println("Score\tGrade");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(scores[i] + "\t\t" + grades[i]);
        }
    }

    public static void printHighestScore(int[] scores) {
        int highest = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        System.out.println("Highest Score: " + highest);
    }

    public static void printLowestScore(int[] scores) {
        int lowest = Integer.MAX_VALUE;
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Lowest Score: " + lowest);
    }

    public static void printAverageScore(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / SIZE;
        System.out.println("Average Score: " + average);
    }
}

