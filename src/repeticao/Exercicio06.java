package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

    // Ler n inteiros e classificar no intervalo [10,20]
    private static void exercicio06(Scanner sc) {

        int in = 0;
        int out = 0;

        System.out.print("Digite a quantidade de números: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }
        }

        System.out.println();
        System.out.println(in + " in");
        System.out.println(out + " out");
    }


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio06(sc);

        sc.close();
    }
}
