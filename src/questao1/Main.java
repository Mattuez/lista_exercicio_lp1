package questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Valor dos creditos galacticos do Star trooper: ");
        float credits = keyboard.nextFloat();
        System.out.print("Percentual de aumento: ");
        float percentual = keyboard.nextFloat();
        float output = credits + (credits * (percentual / 100));
        System.out.printf("Creditos finais: %.2f", output);
    }
}
