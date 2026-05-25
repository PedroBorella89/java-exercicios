package repeticao;

import java.util.Scanner;

public class Exercicio11 {

    // Ler a temperatura em Celsius e converter para Fahrenheit. Perguntar se o usuário deseja repetir.
    private static void exercicio11(Scanner sc) {

        char resp;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (9.0 * celsius / 5.0) + 32;

            System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);

            System.out.print("Deseja repetir (s/n)?");
            resp = sc.next().charAt(0);
            System.out.println();
        } while (resp != 'n');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exercicio11(sc);

        sc.close();
    }
}
