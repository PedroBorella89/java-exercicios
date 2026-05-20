package EntradaESaidaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

    // 04 - Calcular o salário do funcionário
    private static void exercicio04(Scanner sc) {

        String nome;
        int horas_trabalhadas;
        double valor_hora, salario;

        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horas_trabalhadas = sc.nextInt();

        System.out.print("Digite o valor da hora do funcionário: ");
        valor_hora = sc.nextDouble();

        salario = horas_trabalhadas * valor_hora;

        System.out.println();
        System.out.printf("O salario de %s é de: R$ %.2f%n", nome, salario);

    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio04(sc);

        sc.close();
    }
}
