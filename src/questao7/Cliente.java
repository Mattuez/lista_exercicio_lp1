package questao7;

public class Cliente {
    private String nome;
    private int dias;
    private int conta;

    public Cliente(String nome, int dias, int conta) {
        this.nome = nome;
        this.dias = dias;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public static int get_conta(int dias) {
        int diaria = 40;
        int conta;

        if (dias < 10){
            conta = (dias * diaria) + (15 * dias);
        } else {
            conta = (dias * diaria) + (8 * dias);
        }

        return conta;
    }
}
