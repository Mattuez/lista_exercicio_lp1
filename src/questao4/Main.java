package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Litros de gasolinas: ");
        float litros = keyboard.nextFloat();
        double total = (litros * 2.5) + 6;

        System.out.printf("Total: R$%.2f", total);
    }
}
