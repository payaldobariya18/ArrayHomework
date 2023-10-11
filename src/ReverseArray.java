import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[5];
        System.out.println("Enter elements in array ");
        for (int i = 0; i <a.length ; i++)
        {
            a[i] = scanner.nextInt();
        }
        System.out.print("Array elements ");
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\nArray reverse elements ");
        for (int i = a.length-1; i>=0; i--)
        {
            System.out.print(a[i]+" ");
        }
    }




}
