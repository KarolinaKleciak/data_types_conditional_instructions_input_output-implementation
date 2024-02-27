package LAB2_P;

import java.util.Scanner;

public class Zad_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean exit = false;

        while (true) {
            System.out.println("CALCULATOR\nWhat you want to do ?: " + "\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.CLOSE THE PROGRAM!");
            int choice = scan.nextInt();
            double number1 = 0, number2 = 0, result = 0;
            if (choice != 5) {
                System.out.println("Enter first number: ");
                number1 = scan.nextDouble();
                System.out.println("Enter second number: ");
                number2 = scan.nextDouble();
            }
            switch (choice) {
                case 1:
                    result = number1 + number2;
                    System.out.println("The result of addition is: " + result);
                    break;
                case 2:
                    result = number1 - number2;
                    System.out.println("The result of subtraction is: " + result);
                    break;
                case 3:
                    result = number1 * number2;
                    System.out.println("The result of the mltiplication is: " + result);
                    break;
                case 4:
                    if (number2 == 0) System.out.println("ERROR: Dividing by zero!");
                    else {
                        result = number1 / number2;
                        System.out.println("The result of the division is: " + result);
                    }
                    break;
                default:
                    System.out.println("End of the program!");
                    exit = true;
                    break;
            }
            if (exit) break;
        }
    }
}
