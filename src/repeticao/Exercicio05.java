package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    // Mostrar os valores ímpares de 1 até X
    private static void exercicio05(Scanner sc) {

        System.out.print("Digite um valor: ");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio05(sc);

        sc.close();
    }
}
