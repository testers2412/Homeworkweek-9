//3. Write a Java program to reverse an array of integer values.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        int a, i;
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements for array: ");
        a = sc.nextInt();
        int[] before = new int[a];
        int[] after = new int[a];
        System.out.println("Please enter " + a + " elements");
        for (i = 0; i < a; i++) {
            before[i] = sc.nextInt();
        }
        System.out.println("Revered array");
        for (i = a; i > 0; i--, j++) {
            after[j] = before[i - 1];
            System.out.println(after[j]);// array is printed reversed.
            sc.close();  // Scanner is closed


        }


    }


}
