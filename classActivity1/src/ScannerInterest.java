import java.util.Scanner;
class ScannerInterest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal");
        //int userPrincipal = Integer.parseInteger(scanner.nextLine());
        int userPrincipal = scanner.nextInt();

        System.out.println("Enter the interest rate as number not decimal");
        int userInterest = scanner.nextInt();

        System.out.println("Enter the number of compound interest per year");
        int userCompound = scanner.nextInt();

        System.out.println("Enter the number of years the account will be left");
        int userYears = scanner.nextInt();




    }

}
