package homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */


public class Iterater {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Prime");
        list.add(10);
        list.add(true);
        list.add(25);
        list.add("Class");

        Iterator it= list.iterator();
        while(it.hasNext() ) {
            System.out.println(it.next());
        }
    }
}
