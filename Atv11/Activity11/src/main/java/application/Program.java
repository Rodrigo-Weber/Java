package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];

        System.out.println("Digite os valores dos vetores A: ");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores dos vetores B: ");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetor1.length; i++) {
            int soma = vetor1[i] + vetor2[i];
            System.out.println(soma);
        }

        sc.close();
    }
}
