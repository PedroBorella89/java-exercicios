import java.util.Locale;
import java.util.Scanner;

public class Exercicios_03_EstruturaCondicional {

    // 01 - Ler um número e dizer se é positivo ou negativo
    private static void exercicio01(Scanner sc) {

        int n;

        System.out.print("Digite um número inteiro: ");
        n = sc.nextInt();

        if (n >= 0) {
            System.out.println("O número digitado é positivo!");
        } else {
            System.out.println("O número digitado é negativo!");
        }
    }

    // 02 - Número par ou ímpar
    private static void exercicio02(Scanner sc) {

        int i;

        System.out.print("Digite um número inteiro: ");
        i = sc.nextInt();

        if (i % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é impar!");

        }
    }

    // 03 - Números múltiplos ou não múltiplos
    private static void exercicio03(Scanner sc) {

        int A, B;

        System.out.println("Digite o primeiro número: ");
        A = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Os números são múltiplos!");
        } else {
            System.out.println("Os números não são múltiplos!");
        }
    }

    // 04 - Hora inicial e hora final
    private static void exercicio04(Scanner sc) {

        int horaInicial, horaFinal, duracao;

        System.out.print("Digite a hora do começo da partida: ");
        horaInicial = sc.nextInt();

        System.out.print("Digite a hora do término do jogo: ");
        horaFinal = sc.nextInt();


        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " horas.");

    }

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

        exercicio04(sc);

        sc.close();
    }
}
