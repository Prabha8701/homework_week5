package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Main obj = new Main();
        char y = 'Y';
        while (y == 'Y') {
            System.out.println("Enter First number");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println("Enter Second number");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /: ");
            char symbol = scanner.next().charAt(0);
            obj.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation Please enter Y or N :");
            y = scanner.next().charAt(0);
        }
    }
}
