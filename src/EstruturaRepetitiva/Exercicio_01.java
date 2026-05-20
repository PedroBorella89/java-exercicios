package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

    // Somar números digitados aleatoriamente
    private static void exercicio01(Scanner sc) {

        int n;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        int soma = 0;
        while (n != 0) {
            System.out.print("Digite um número: ");
            n = sc.nextInt();
            soma += n; // equivale a soma = soma + n
        }

        System.out.println("O valor da soma é: " + soma);
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio01(sc);

        sc.close();
    }
}
