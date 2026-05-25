package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    // Soma de N números
    private static void exercicio04(Scanner sc) {

        System.out.print("Digite quantos números que você quer somar: ");
        int qtde = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < qtde; i++) {
            System.out.print("Digite o número: ");
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println();
        System.out.println("Valor da soma: " + soma);
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio04(sc);

        sc.close();
    }
}
