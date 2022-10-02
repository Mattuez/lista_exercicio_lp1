package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;

        do {
            if (i != 0){
                keyboard.nextLine();
            }
            System.out.print("Nome: ");
            String nome = keyboard.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Salario: ");
            float salario = keyboard.nextFloat();

            if (salario < 500) {
                System.out.printf("Salario reajustado: R$%.2f\n", salario * 1.2);
            } else {
                System.out.println("Funcionario nao tem direito ao beneficio");
            }

            i++;
        } while (true);
    }
}
