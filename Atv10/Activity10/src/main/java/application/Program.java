package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int maior =0, posmaior =0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior){
                maior = vetor[i];
                posmaior = i+1;
            }
        }

        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSIÇÃO DE MAIOR VALOR = " + posmaior);

        sc.close();
    }
}
