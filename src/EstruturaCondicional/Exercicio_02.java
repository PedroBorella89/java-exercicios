package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

    // 02 - Número par ou ímpar
    private static void exercicio02(Scanner sc) {

        int i;

        System.out.print("Digite um número inteiro: ");
        i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é impar!");
        }
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio02(sc);

        sc.close();

    }
}


