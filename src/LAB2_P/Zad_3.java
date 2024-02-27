package LAB2_P;

import java.util.Scanner;

public class Zad_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of miles: ");

        double mile = scan.nextDouble();

        scan.close();

        double km = mile * 1.61;

        System.out.println("Converting the given miles into kilometers -> answer: " + km);
    }
}
