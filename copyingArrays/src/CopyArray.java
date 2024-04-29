import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements for the arrays: ");
        final int numElements = scanner.nextInt();

        int[][] arrays = new int[5][numElements];

        for (int i = 0; i < arrays[0].length; i++) {
            System.out.print("Enter element for array1 at index " + i + ": ");
            arrays[0][i] = scanner.nextInt();
        }
        System.out.println("Array1:");
        printArray(arrays[0]);

        for (int i = 0; i < arrays[0].length; i++) {
            arrays[1][i] = arrays[0][i];
        }
        System.out.println("Array2 (copied from Array1):");
        printArray(arrays[1]);

        for (int i = 0; i < arrays[0].length; i++) {
            arrays[2][i] = arrays[0][i] * arrays[0][i];
        }
        System.out.println("Array3 (squared elements of Array1):");
        printArray(arrays[2]);

        for (int i = 0; i < arrays[0].length; i++) {
            arrays[3][i] = arrays[0][arrays[0].length - 1 - i];
        }
        System.out.println("Array4 (reversed elements of Array1):");
        printArray(arrays[3]);

        scanner.close();
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


