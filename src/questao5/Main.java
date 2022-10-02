package questao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Salario: ");
        float salario = keyboard.nextFloat();
        System.out.print("Prestacao: ");
        float prestacao = keyboard.nextFloat();

        if (prestacao <= (salario * 0.3)) {
            System.out.println("Emprestimo concedido");
        } else {
            System.out.println("Emprestimo nao concedido");
        }
    }
}
