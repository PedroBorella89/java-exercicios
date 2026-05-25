package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    // Mostrar a quantidade de clientes que abasteceram cada tipo de combustível
    private static void exercicio03(Scanner sc) {

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    int tipo;

    System.out.println("Selecione o tipo do combustível ou pressione 0 para encerrar o programa: ");
    System.out.println("1.Alcool");
    System.out.println("2.Gasolina");
    System.out.println("3.Diesel");
    System.out.print("Digite a opção: ");
    tipo = sc.nextInt();

    while (tipo != 0) {

        if (tipo == 1) {
            alcool += 1;
        }
        else if (tipo == 2) {
            gasolina += 1;
        }
        else if (tipo == 3) {
            diesel += 1;
        }
        System.out.println();
        System.out.println("Selecione o tipo do combustível ou pressione 0 para encerrar o programa: ");
        System.out.println("1.Alcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.print("Digite a opção: ");
        tipo = sc.nextInt();
    }

        System.out.println();
        System.out.println("Resultados:");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio03(sc);

        sc.close();
    }
}
