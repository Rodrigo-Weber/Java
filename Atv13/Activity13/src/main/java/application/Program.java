package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        int soma = 0;
        int media;
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            soma += vetor[i];
        }
        media = soma / vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contador++;
            }
        }

        if (contador != 0){
            System.out.print("MEDIA DOS PARES = " + media);
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }
}
