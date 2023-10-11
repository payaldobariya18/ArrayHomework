import java.util.Arrays;
import java.util.Scanner;
//Write a Java program to find the common elements between two arrays (string values).
public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        String[] array1 = {"Addition", "Subtraction", "Division", "Multiplication", "Modulus"};
        String[] array2 = {"Python", "Ruby", "Addition", "Modulus", "C++", "C#"};
//        System.out.println("Array1 : "+Arrays.toString(array1));
//        System.out.println("Array2 : "+Arrays.toString(array2));
//
         //Iterating Array1
        for (int i = 0; i <array1.length ; i++)
        {   //Iterating Array2
            for (int j = 0; j <array2.length ; j++)
            {
                if(array1[i]  == array2[j])
                {
                    System.out.println(array1[i]);;
            }

        }


         }

        }

    }

