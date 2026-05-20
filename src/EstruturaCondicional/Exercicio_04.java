package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

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

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exercicio04(sc);

        sc.close();

    }
}
