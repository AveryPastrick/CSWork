import java.io.*;
import java.util.Scanner;

public class FileActivity {

    public static void main(String[] args) {
        // Step 1: Read from courses.txt
        System.out.println("Reading from courses.txt:");
        readFromFile("courses.txt");

        // Step 2: Write to output.txt
        System.out.println("\nWriting to output.txt:");
        writeToFile("output.txt");

        // Step 3: Append to output.txt
        System.out.println("\nAppending to output.txt:");
        appendToFile("output.txt");
    }

    // Method to read from a file
    private static void readFromFile(String fileName) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    // Method to write to a file
    private static void writeToFile(String fileName) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println("Header: ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data to write to the file:");
            String data = scanner.nextLine();
            writer.println(data);
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }

    // Method to append to a file
    private static void appendToFile(String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            PrintWriter printWriter = new PrintWriter(writer);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter data to append to the file:");
            String data = scanner.nextLine();
            printWriter.println(data);
            printWriter.close();
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }
}
