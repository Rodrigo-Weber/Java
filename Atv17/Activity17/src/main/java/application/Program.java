package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nRent #" + (i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            vect[roomNumber - 1] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println((i + 1) + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
