import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int cpf;
    protected String s;
    protected ArrayList<String> lista = new ArrayList<>();

    public Pessoa(){
        this.nome = "";
        this.cpf = 0;
    }

    public void mostrarInformacoes(){
        s = "";
        s += "Nome: " + nome;
        s += " | CPF: "+ cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
