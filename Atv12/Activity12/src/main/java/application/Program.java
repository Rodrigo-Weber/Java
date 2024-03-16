package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        double media = 0;
        double total = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();

            total = total + vetor[i];
        }
        media = total / vetor.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
