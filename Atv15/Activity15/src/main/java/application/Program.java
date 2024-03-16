package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];

        for (int i = 0; i < nome.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %o aluno\n", i+1);
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        for (int i = 0; i < nota1.length; i++) {
            media[i] = (nota1[i] + nota2[i]) / n;
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < nota1.length; i++) {
            if (media[i] > 6.0){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
