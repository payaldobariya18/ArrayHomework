import java.util.Scanner;

public class InsertElement {
    //Write a Java program to insert an element (specific position) into an array.
    //   a[4] = 10 20 30 40
    //  loc = 2 item = 100
    // a[4+1] = 10 20 100 30 40
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Array size  ");
        int size = scanner.nextInt();
        int [] a = new int[size + 1];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            // System.out.println(a.length);
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter Array Location: ");
        int loc = scanner.nextInt();
        System.out.println("Enter new number: ");
        int number = scanner.nextInt();

        for (int i = size; i > loc; i--) {
            a[i] = a[i - 1];
        }
        a[loc] = number;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }

    }

}
