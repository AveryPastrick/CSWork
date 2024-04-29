import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = scanner.nextLine();

        System.out.print("Whats your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What city do you live in: ");
        String city = scanner.nextLine();

        System.out.print("what college do you go to: ");
        String college = scanner.nextLine();

        System.out.print("what is your major: ");
        String major = scanner.nextLine();

        System.out.print("Enter a type of animal: ");
        String animal = scanner.nextLine();

        System.out.print("whats your pets name: ");
        String petName = scanner.nextLine();

        String story = String.format("There once was a person named %s who lived in %s. At the age of %d, %s went to college at %s. %s graduated with a major in %s. Then, %s adopted a(n) %s named %s. They both lived happily ever after!",
                name, city, age, name, college, name, major, name, animal, petName);

        System.out.println(story);

        scanner.close();
    }
}
