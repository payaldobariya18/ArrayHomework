import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfArrays {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //input the first array of Strings
        System.out.println("Enter the size of the first array ");
        int size1 = scanner.nextInt();
        int [] array1 = new int [size1];

        System.out.println("Enter elements for first array ");
        for (int i = 0; i <size1 ; i++)
        {
            System.out.print("Elements " + (i + 1) + ":");
           array1[i] = scanner.nextInt();
        }
        // input the second array ofstrings
        System.out.print("Enter the size of the second array ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter elements for second array: ");
        for (int i = 0; i <size2 ; i++)
        {
            System.out.print("Element " + (i+1) + ": ");
           array2[i] = scanner.nextInt();
        }
       // Check equality
        boolean areEqual = Arrays.equals(array1,array2);
        //display the result
        if (areEqual)
        {
            System.out.println("The arrays are equal.");
        } else
        {
            System.out.println("The arrays are not equal");
        }
    }
}
