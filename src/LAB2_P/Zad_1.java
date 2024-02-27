package LAB2_P;

import java.util.Scanner;

public class Zad_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height: ");

        int h = scan.nextInt();

        scan.close();

        String xStr = "*";

        for (int i = h; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print(xStr);
            xStr = xStr + "**";
            System.out.println();
        }
    }
}
