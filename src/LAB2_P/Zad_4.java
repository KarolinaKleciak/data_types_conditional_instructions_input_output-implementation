package LAB2_P;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Zad_4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        boolean should_continue = true;

        do {

            Random rand = new Random();
            int number = rand.nextInt();
            numbers.add(number);
            System.out.println(number);

            System.out.println("Would you like to add next number [Y/N]: ?");
            char letter = scan.next().charAt(0);


            if ((letter == 'N') || ((letter == 'n'))) should_continue = false;

        } while (should_continue);

        int min = numbers.get(0);
        int max = numbers.get(0);
        double average;
        double sum = 0;

        System.out.print("Entered numbers are: \n");

        for (int element : numbers) {
            System.out.println(element + "   ");
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
            sum = sum + element;
        }
        average = sum / numbers.size();
        System.out.println("Minimum: " + min + "\nMaximum: " + max + "\nAverage: " + average);
        System.out.println("Quantity of the number: " + numbers.size());
        scan.close();

    }
}
