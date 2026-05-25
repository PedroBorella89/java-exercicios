package repeticao;

import java.util.Scanner;

public class Exercicio10 {

    // Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor
    private static void exercicio10(Scanner sc) {

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            int linha = i;
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d%n", linha, quadrado, cubo);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        exercicio10(sc);

        sc.close();
    }
}
