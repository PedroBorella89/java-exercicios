import java.util.Locale;
import java.util.Scanner;

public class Exercicios_02_EntradaESaidaDeDados {

    // 01 - Somar de dois números
    private static void exercicio01(Scanner sc) {

        int a, b, soma;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        soma = a + b;

        System.out.println("O valor da soma é: " + soma);

    }

    // 02 - Calcular a área de um círculo
    private static void exercicio02(Scanner sc) {

        double r, area;
        double pi = 3.14159;

        System.out.print("Digite o valor do raio do círculo: ");
        r = sc.nextDouble();

        area = pi * (r * r);

        System.out.printf("A área do círculo é: %.4f%n", area);

    }

    // 03 - Calcular diferenças de produtos
    private static void exercicio03(Scanner sc) {

        int a, b, c, d, diferenca;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        c = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        d = sc.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("O valor da diferença é: " + diferenca);

    }

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

        System.out.printf("O salario de %s é de: R$ %.2f%n", nome, salario);

    }

    // 05 - Carrinho de compras
    private static void exercicio05(Scanner sc) {

        String p1, p2;
        int q1, q2;
        double v1, v2, total;

        System.out.print("Digite o nome do produto 01: ");
        p1 = sc.nextLine();

        System.out.print("Digite a quantidade do produto 01: ");
        q1 = sc.nextInt();

        System.out.print("Digite o valor unitário do produto 01: ");
        v1 = sc.nextDouble();
        sc.nextLine();
        System.out.println();

        System.out.print("Digite o nome do produto 02: ");
        p2 = sc.nextLine();

        System.out.print("Digite a quantidade do produto 02: ");
        q2 = sc.nextInt();

        System.out.print("Digite o valor unitário do produto 02: ");
        v2 = sc.nextDouble();
        System.out.println();

        total = (q1 * v1) + (q2 * v2);

        System.out.printf("Produtos comprados: %d %s, %d %s%n", q1, p1, q2, p2);
        System.out.printf("O valor total da compra é: R$ %.2f%n", total);

    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio01(sc);

        sc.close();
    }
}
