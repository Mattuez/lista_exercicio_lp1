package questao7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int faturamento = 0;
        int aux = 0;

        System.out.println("Digite \"fim\" no nome do cliente para finalizar o programa");

        do {
            if (aux != 0) {
                keyboard.nextLine();
            }

            System.out.print("Nome do cliente: ");
            String input_nome = keyboard.nextLine();
            if (input_nome.equalsIgnoreCase("fim")){
                break;
            }
            System.out.print("Quantidade de dias: ");
            int input_dia = keyboard.nextInt();
            int input_conta = Cliente.get_conta(input_dia);

            Cliente x = new Cliente(input_nome, input_dia, input_conta);
            clientes.add(x);
            aux++;
        } while (true);

        for (Cliente cliente : clientes) {
            System.out.printf("Conta %s: R$%d\n", cliente.getNome(), cliente.getConta());
            faturamento += cliente.getConta();
        }

        System.out.printf("Faturamento: R$%d\n", faturamento);
    }
}


