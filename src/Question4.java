import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop.
 */

public class Question4 {
    public static void main(String[] args) {
        ArrayList <String> primeColour = new ArrayList<String>();// using array list to add values into array
        primeColour.add("Red");
        primeColour.add("Blue");
        primeColour.add("Green");
        primeColour.add("Yellow");

        for (Object cl : primeColour) {// using for each loop to print the array elements
            System.out.println(cl);
        }


    }


}
