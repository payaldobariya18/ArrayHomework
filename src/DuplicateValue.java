import java.util.Scanner;
// java program to find the duplicate values of an array of integer values.
public class DuplicateValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of  Array ");

        int value = scanner.nextInt();
        int [] a = new int[value];
        System.out.println("Enter the elements of array ");//input the elements of the array
        for (int i = 0; i <value ; i++)
        {
            a[i] = scanner.nextInt();
        }// end of the for loop
        System.out.print("Array: ");
        for (int i = 0; i <value ; i++)
        {
            System.out.print(a[i]+" ");
        }
        //System.out.println(" ");
        System.out.print("\nDuplicate elements are: ");
       // Search for the duplicate elements
        for (int i = 0; i <a.length ; i++) {


            for (int j = i+1; j <a.length ; j++)
            {
             if(a[i]==a[j])
             {
                 System.out.print(a[j]+" ");
             }
            }
        }
    }
}
