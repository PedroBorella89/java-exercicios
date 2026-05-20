package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

    // 05 - Ler o código do item, a quantidade e mostrar o valor da conta
    private static void exercicio05(Scanner sc) {

        int id, qtd;
        double total = 0;

        System.out.print("Digite o ID do produto: ");
        id = sc.nextInt();

        if (id < 1 || id > 4) {
            System.out.println("Valor inválido!");
            return;
        }

        System.out.print("Digite a quantidade desejada: ");
        qtd = sc.nextInt();

        if (id == 1) {
            total = qtd * 4.00;
        } else if (id == 2) {
            total = qtd * 4.50;
        } else if (id == 3) {
            total = qtd * 5.00;
        } else if (id == 4) {
            total = qtd * 1.50;
        }

        System.out.printf("Valor total: %.2f%n", total);

    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio05(sc);

        sc.close();
    }
}
