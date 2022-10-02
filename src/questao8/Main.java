package questao8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int aux = 0;

        do {
            if(aux!=0){
                scanner.nextLine();
            }
            System.out.print("Digite o nome do paciente: ");
            String input_nome = scanner.nextLine();
            if (input_nome.equalsIgnoreCase("fim")){
                break;
            }
            System.out.print("Digite o sexo do paciente: ");
            String input_sexo = scanner.nextLine();
            System.out.print("Digite o peso do paciente: ");
            float input_peso = scanner.nextFloat();
            System.out.print("Digite a idade do paciente: ");
            int input_idade = scanner.nextInt();
            System.out.print("Digite a altura do paciente(cm): ");
            float input_altura = scanner.nextFloat();

            Paciente x = new Paciente(input_nome, input_sexo, input_peso, input_idade, input_altura);

            pacientes.add(x);
            aux++;
        } while (true);

        Paciente.print_output(pacientes);
    }
}
