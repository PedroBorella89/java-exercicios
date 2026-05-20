package EntradaESaidaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

    // 02 - Calcular a área de um círculo
    private static void exercicio02(Scanner sc) {

        double r, area;
        double pi = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        r = sc.nextDouble();

        area = pi * (r * r);

        System.out.printf("A área do círculo é: %.4f%n", area);

    }

    public static void main(String[] args) {

        Locale.setDefault((Locale.US));
        Scanner sc = new Scanner(System.in);

        exercicio02(sc);

        sc.close();
    }
}
