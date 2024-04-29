import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum;

        System.out.print("Enter a number: ");
        userNum = scanner.nextInt();
        if(userNum % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");

        }

    }
}
