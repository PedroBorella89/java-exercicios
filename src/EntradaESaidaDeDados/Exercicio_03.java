package EntradaESaidaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03 {

    // 03 - Calcular diferenças de produtos
    private static void exercicio03(Scanner sc) {

        int a, b, c, d, diferenca;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println();
        System.out.println("O valor da diferença é: " + diferenca);

    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio03(sc);

        sc.close();
    }
}
