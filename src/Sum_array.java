import java.util.Arrays;
import java.util.Scanner;
//Write a Java program to sum values of an array.
public class Sum_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter required size of array: ");
        int size = scanner.nextInt();
        int[] myarray = new int [size];
        int sum = 0;

        System.out.println("Enter the numbers one by one ");

        for (int i = 0; i <size ; i++)
        {
          myarray[i] = scanner.nextInt();
          sum = sum + myarray[i];
        }
        System.out.println("Numbers of array " + Arrays.toString(myarray));
        System.out.println("The sum of the array " + sum);
    }
}
