package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the size of the tree? ");
        int height = sc.nextInt();
        int quantitySpacing;
        String space = "";
        int characterQuantity = 1;
        String symbol = "";

        for (int i = 1; i <= height; i++) {

            quantitySpacing = height - i;

            for (int j = 1; j <= quantitySpacing; j++) {
                space += " ";
            }

            for (int k = 1; k <= characterQuantity; k++) {
                symbol += "*";
            }

            System.out.println( space + symbol );
            characterQuantity += 2;
            symbol = "";
            space = "";
        }

        sc.close();
    }
}
