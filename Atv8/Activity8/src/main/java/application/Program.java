package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        double media = 0;
        double porcentagemIdade;
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

            media += altura[i] / n;
        }

        int menores = 0;
        for (int j = 0; j < n; j++) {
            if (idade[j]<16){
                menores++;
            }
        }
        porcentagemIdade = ((double)menores/n) * 100.0;

        System.out.printf("\nAltura média: %.2f", media);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%\n", porcentagemIdade);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
