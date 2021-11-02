/*
    Write a Java program to retrieve an element (at a specified index) from a given
    array list
     */

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int ind;
        String element;
        ArrayList<String> fruit = new ArrayList();
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Grapes");
        fruit.add("Strawberry");
        fruit.add("Peach");
        fruit.add("Melon");
        fruit.add("Banana");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number between 0 and 7: ");
        ind = scanner.nextInt();
        element = fruit.get(ind);
        System.out.println("At index "+ind+"- "+element);


    }


}






