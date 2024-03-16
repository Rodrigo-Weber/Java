package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        double soma =0;
        for (int i=0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();

            soma += vetor[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "  ");
        }

        System.out.print("\nSOMA = " + soma);

        double media = soma / vetor.length;
        System.out.print("\nMEDIA = " + media);

        sc.close();
    }
}
