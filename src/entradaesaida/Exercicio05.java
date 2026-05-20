package entradaesaida;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    // 05 - Carrinho de compras
    private static void exercicio05(Scanner sc) {

        String p1, p2;
        int q1, q2;
        double v1, v2, total;

        System.out.print("Digite o nome do produto 01: ");
        p1 = sc.nextLine();

        System.out.print("Digite a quantidade do produto 01: ");
        q1 = sc.nextInt();

        System.out.print("Digite o valor unitário do produto 01: ");
        v1 = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        System.out.print("Digite o nome do produto 02: ");
        p2 = sc.nextLine();

        System.out.print("Digite a quantidade do produto 02: ");
        q2 = sc.nextInt();

        System.out.print("Digite o valor unitário do produto 02: ");
        v2 = sc.nextDouble();
        System.out.println();

        total = (q1 * v1) + (q2 * v2);

        System.out.printf("Produtos comprados: %d %s, %d %s%n", q1, p1, q2, p2);
        System.out.printf("O valor total da compra é: R$ %.2f%n", total);

    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio05(sc);

        sc.close();
    }
}
