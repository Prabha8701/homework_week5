package homework;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if else)
 */

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> num = new java.util.HashSet<>();
        num.add(4);
        num.add(7);
        num.add(8);

        System.out.println("Numbers present in the set :");

        for (int i = 0; i <= 10; i++) {
            if (num.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");
            }

        }
    }

}
