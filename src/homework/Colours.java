package homework;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;
import java.util.List;

public class Colours {
    public static void main(String[] args) {
       List<String> list=new ArrayList();
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        for (String c : list) {
            System.out.println(c);
        }
    }
}
