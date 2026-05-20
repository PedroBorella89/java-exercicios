package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    // 01 - Ler um número e dizer se é positivo ou negativo
    private static void exercicio01(Scanner sc) {

        int n;

        System.out.print("Digite um número inteiro: ");
        n = sc.nextInt();

        if (n >= 0) {
            System.out.println("O número digitado é positivo!");
        }
        else {
            System.out.println("O número digitado é negativo!");
        }
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio01(sc);

        sc.close();
    }
}
