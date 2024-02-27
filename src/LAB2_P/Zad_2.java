package LAB2_P;

import java.util.Scanner;
import java.lang.Math;

public class Zad_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter parameter a: " + "\n" + "Enter parameter b: " + "\n" + "Enter parameter c: ");

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        scan.close();

        double delta = (Math.pow(b, 2) - 4 * a * c);

        if (delta == 0 ) System.out.println("x0 = " + (-b) / 2 * a);
        else if(delta > 0 ){
            System.out.println("x1 = " + (-b - (Math.sqrt(delta)) / 2 * a));
            System.out.println("x2 = " + (-b + (Math.sqrt(delta)) / 2 * a));
        }else if(delta < 0) System.out.println("No result, delta lesser than 0!");
    }
}