package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

    // leia N pares de números e mostre a divisão do primeiro pelo segundo
    private static void exercicio07(Scanner sc) {

        System.out.print("Digite quantos pares quer calcular: ");
        int qtde = sc.nextInt();
        System.out.println();

        for (int i = 0; i < qtde; i++) {
            System.out.print("Digite o primeiro número: ");
            float n1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            float n2 = sc.nextInt();

            float resultado = n1 / n2;

            if (n1 == 0 || n2 == 0) {
                System.out.println("Divisao impossível");
                System.out.println();
            }
            else {
                System.out.printf("Resultado: %.2f%n", resultado);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exercicio07(sc);

        sc.close();
    }
}
