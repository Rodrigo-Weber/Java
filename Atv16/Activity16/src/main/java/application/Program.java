package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        char[] sexo = new char[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da "+(i+1)+"a pessoa: ");
            altura[i] =  sc.nextDouble();
            System.out.print("Genero da "+(i+1)+"a pessoa: ");
            sc.nextLine();
            sexo[i] = sc.next().charAt(0);
        }

        double maior = altura[0];
        double menor = altura[0];
        for (int i = 0; i < n; i++) {
            if(altura[i] > maior){
                maior = altura[i];
            }
            if (altura[i] < menor){
                menor = altura[i];
            }
        }

        int contador = 0;
        double total = 0;
        double media = 0;
        for (int i = 0; i < n; i++) {
            if (sexo[i] == 'M'){
                contador++;
            }
            else {
                total += altura[i];
            }
        }
        media = total / altura.length;

        System.out.print("Menor altura: " + menor);
        System.out.print("\nMaior altura: " + maior);
        System.out.printf("\nMedia da altura das mulheres: %.2f", media);
        System.out.print("\nNumero de homens: " + contador);

        sc.close();
    }
}
