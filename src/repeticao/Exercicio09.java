package repeticao;

import java.util.Scanner;

public class Exercicio09 {

    // Ler um número inteiro N e calcular todos os seus divisores
    private static void exercicio09(Scanner sc) {

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exercicio09(sc);

        sc.close();
    }
}
