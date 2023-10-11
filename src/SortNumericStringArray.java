import java.lang.reflect.Array;
import java.util.Arrays;
// Write a Java program to sort a numeric array and a string array.
public class SortNumericStringArray {
    public static void main(String[] args) {
        int [] numeric_array = {2023,2222,1625,1845,1212,2000,1034,999,508,2109};

        String []string_array = {"Polymorphism" , "Modifier" , "Access Modofier" , "Java Language" , "Abstraction"};

        System.out.println("Original numeric array: " + Arrays.toString(numeric_array));
        Arrays.sort(numeric_array);
        System.out.println("sorted numeric array: " + Arrays.toString(numeric_array));

        System.out.println("Original String array: " + Arrays.toString(string_array));
        Arrays.sort(string_array);
        System.out.println("sorted numeric array: " + Arrays.toString(string_array));






    }


}
