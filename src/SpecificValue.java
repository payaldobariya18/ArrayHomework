import java.util.Scanner;
//Write a Java program to test if an array contains a specific value
public class SpecificValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values in array ");
        int [] num = new int [5];
        int n;
        int count = 0;
        for (int i = 0; i <num.length ; i++)
        {
           num[i] = scanner.nextInt();
        }
        System.out.println("Enter Search number ");
         n = scanner.nextInt();
        for (int i = 0; i <num.length ; i++)
        {
           if (num[i] ==n)
           {
               count++;
           }
        }
        if (count>0)
        {
            System.out.println("Number Found "+count+" times ");
        } else
        {
            System.out.println("Number Not Found");
        }
    }








}
