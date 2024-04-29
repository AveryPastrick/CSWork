public class CFTable {
    public static void main(String[] args) {
        System.out.println("Celsius  |  Fahrenheit");
        System.out.println("----------------------");

        for (int celsius = 0; celsius <= 20; celsius++) {
            double fahrenheit = (9.0 / 5) * celsius + 32;
            System.out.printf("%-8d |  %-10.2f\n", celsius, fahrenheit);
        }
    }
}
