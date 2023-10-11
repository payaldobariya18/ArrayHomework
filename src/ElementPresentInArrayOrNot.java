import java.util.Scanner;

public class ElementPresentInArrayOrNot {
    public static void main(String[] args) {
     int[] numbers = {3,5,7,8,9,2,1};
     //input element to search
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to Search: ");
        int target = scanner.nextInt();
         boolean found = false;
         // Loop through array to check if the element is present
        for(int number : numbers)
        {
          if(number==target)
          {
              found=true;
              break;
          }

        }
        if(found)
        {
            System.out.println(target + " is present in the array. ");
        }
        else
        {
            System.out.println(target + " is not present in the array. ");
        }









    }















}
