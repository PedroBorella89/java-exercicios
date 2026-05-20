package EntradaESaidaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01 {

    //01 - Somar dois números
    private static void exercicio01 (Scanner sc){

        int a, b, total;

        System.out.print("Digite o valor do primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o valor do segundo número: ");
        b = sc.nextInt();

        total = a + b;

        System.out.printf("O valor da soma é: %d%n", total);

    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio01(sc);

        sc.close();

    }
}
