import java.util.Scanner;
//Write a Java program to find the index of an array element
public class Index {
    public static void main(String[] args) {
        int [] a = { 5, 8, 3, 4, 2,9,10,23};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter any number from the given array ");
        int value = scanner.nextInt();
        for (int i = 0; i <a.length ; i++)
        {
            if(a[i] == value)
            {
                System.out.println(i);
            }
        }
    }


}
