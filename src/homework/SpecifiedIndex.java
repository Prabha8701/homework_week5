package homework;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;

import java.util.Scanner;

public class SpecifiedIndex {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add(50);
        list.add(true);
        list.add('H');

        System.out.println(" Enter value you would like to print :");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(list.get(i));
    }
}
