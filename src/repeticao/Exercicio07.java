package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

    //Apresente a média ponderada para cada um destes conjuntos de 3 valores
    private static void exercicio07(Scanner sc) {

        System.out.print("Digite a quantidade de testes: ");
        int qtde = sc.nextInt();
        System.out.println();

        for (int i = 0; i < qtde; i++) {
            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextDouble();

            System.out.print("Digite o terceiro número: ");
            double n3 = sc.nextDouble();

            double media = n1 + n2 + n3 / 3;

            System.out.println();
            System.out.printf("Media: %.2f%n", media);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio07(sc);

        sc.close();
    }
}
