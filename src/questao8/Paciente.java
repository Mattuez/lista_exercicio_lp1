package questao8;

import java.util.ArrayList;

public class Paciente {
    private String nome;
    private String sexo;
    private float peso;
    private int idade;
    private float altura;

    public Paciente(String nome, String sexo, float peso, int idade, float altura){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setPeso(peso);
        this.setIdade(idade);
        this.setAltura(altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public static void print_output(ArrayList<Paciente> pacientes) {
        System.out.printf("Numero de pacientes: %d\n", pacientes.size());

        float media_idade_homens = get_media_idade_homens(pacientes);
        System.out.printf("Media de idade dos homens: %f\n", media_idade_homens);

        int qnt_mulher_cnd = get_qnt_mulher_cnd(pacientes);
        System.out.printf("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: %d\n", qnt_mulher_cnd);
    }

    private static int get_qnt_mulher_cnd(ArrayList<Paciente> pacientes) {
        int qnt_mulher_cnd = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getSexo().equalsIgnoreCase("feminino") && paciente.getPeso() > 70 &&
                    (paciente.getAltura() > 160 && paciente.getAltura() < 170)) {
                qnt_mulher_cnd++;
            }
        }
        return  qnt_mulher_cnd;
    }

    private static float get_media_idade_homens(ArrayList<Paciente> pacientes) {
        int qnt_homens = 0;
        float media_idade_homens = 0;
        for (Paciente paciente : pacientes){
            if (paciente.getSexo().equalsIgnoreCase("masculino")){
                qnt_homens++;
                media_idade_homens = media_idade_homens + paciente.getIdade();
            }
        }
        media_idade_homens = media_idade_homens / qnt_homens;

        return media_idade_homens;
    }
}
