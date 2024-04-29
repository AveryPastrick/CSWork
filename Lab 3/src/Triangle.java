import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1;
        int side2;
        int side3;

        System.out.print("Enter the first side: ");
        side1 = scanner.nextInt();

        System.out.print("Enter the second side: ");
        side2 = scanner.nextInt();

        System.out.print("Enter the third side: ");
        side3 = scanner.nextInt();

        if((side1 != side2) && (side2 != side3) && (side1 != side3)){
            System.out.print("your triangle is Scalene");
        }

        else if((side1 == side2 && (side2 == side3) && (side1 == side3))){
            System.out.print("your triangle is Equilateral");
        }
        else{
            System.out.print("your triangle is Isosceles");
        }

    }
}
