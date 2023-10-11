import java.util.Scanner;
// Java program to enter array and sort the values in ascending order
public class AscendingOrder {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements in array ");

        int temp;
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print(a[i] + " ");
        }

    }

}

