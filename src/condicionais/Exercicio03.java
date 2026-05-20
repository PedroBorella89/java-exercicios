package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    // 03 - Números múltiplos ou não múltiplos
    private static void exercicio03(Scanner sc) {

        int A, B;

        System.out.print("Digite o primeiro número: ");
        A = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        B = sc.nextInt();

        System.out.println();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Os números são múltiplos!");
        } else {
            System.out.println("Os números não são múltiplos!");
        }
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio03(sc);

        sc.close();

    }
}
