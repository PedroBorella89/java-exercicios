package repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

    // Ler duas coordenadas e escrever em qual quadrante cartesiano pertence
    private static void exercicio02(Scanner sc) {

        System.out.print("Digite a primeira coordenada: ");
        int x = sc.nextInt();

        System.out.print("Digite a segunda coordenada: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            }
            else {
                System.out.println("Quarto quadrante");
            }

            System.out.println();

            System.out.print("Digite a primeira coordenada: ");
            x = sc.nextInt();

            System.out.print("Digite a segunda coordenada: ");
            y = sc.nextInt();
        }

        System.out.println("Programa encerrado.");
    }

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio02(sc);

        sc.close();
    }
}
