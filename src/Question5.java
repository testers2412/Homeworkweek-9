
//5. Write a Java program to iterate through all elements in an array list using Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class Question5 {
    public static void main(String[] args) {
        ArrayList <String> oops = new ArrayList <String> ();
        oops.add("Object");
        oops.add("Class");
        oops.add("Inheritance");
        oops.add("Polymorphism");
        oops.add("Encapsulation");
        oops.add("Abstraction");

        Iterator it = oops.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}
