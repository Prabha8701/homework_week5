package homework;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */

public class EmptyOrNot {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add(50);
        list.add(true);
        list.add('H');

        if (list.isEmpty()){
            System.out.println("The array list is Empty");
        } else {
            System.out.println("The Array list is not Empty");
        }
    }
}
