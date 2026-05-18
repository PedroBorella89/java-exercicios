import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicios_01_SaidaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Variáveis
        String product1 = "Computer";
        String product2 = "Laptop";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        // Saídas
        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", product1, price1);
        System.out.printf("%s, which price is $%.2f%n", product2, price2);

        System.out.println();

        System.out.printf("Record %d years old, code %d and gender: %c%n", age, code, gender);

        System.out.println();

        System.out.printf("Measure with four decimal places: %.4f%n", measure);

    }
}