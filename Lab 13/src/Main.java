import java.util.Scanner;

class GCD {
    public int findGCDForLoop(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public int findGCDWhileLoop(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        return n1;
    }

    public int findGCDRecursively(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return findGCDRecursively(n2, n1 % n2);
    }
}
class GCDTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GCD gcdCalculator = new GCD();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int gcdForLoop = gcdCalculator.findGCDForLoop(num1, num2);
        System.out.println("1. for loop gcd: " + gcdForLoop);

        int gcdWhileLoop = gcdCalculator.findGCDWhileLoop(num1, num2);
        System.out.println("2. while loop gcd: " + gcdWhileLoop);

        int gcdRecursively = gcdCalculator.findGCDRecursively(num1, num2);
        System.out.println("3. recursive gcd: " + gcdRecursively);

        scanner.close();
    }
}


