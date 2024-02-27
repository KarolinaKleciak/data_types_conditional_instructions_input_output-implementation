package LAB2_P;

import java.util.Scanner;

public class Zad_6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean is_valid = true;

        while (true) {

            System.out.println("Enter the price of the car: ");
            double car_price = scan.nextDouble();
            System.out.println("Enter the monthly installment count: ");
            int montly_installment = scan.nextInt();
            System.out.println("Enter the own contribution: ");
            double own_contribution = scan.nextDouble();
            double montly_installment_price;

            if (own_contribution > 300000) {
                System.out.println("Too much own contribution !");
            } else {
                if (montly_installment < 24) car_price = car_price * 1.02;
                else if (montly_installment < 48) car_price = car_price * 1.03;
                else if (montly_installment < 60) car_price = car_price * 1.04;
                else if (montly_installment < 72) car_price = car_price * 1.05;
                else if (montly_installment < 96) car_price = car_price * 1.06;
                else {
                    is_valid = false;
                    System.out.println("Incorrect number of installments !");
                }
                if (is_valid) {
                    montly_installment_price = (car_price - own_contribution) / montly_installment;
                    System.out.println("Montly instalment price is: " + montly_installment_price);
                }
            }
            System.out.println("Do you want to do another calculation [Y/N] ? ");
            char letter = scan.next().charAt(0);
            if ((letter == 'N') || ((letter == 'n'))){
                System.out.println("The end of the program! ");
                break;
            }
        }
    }
}
