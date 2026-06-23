package pacote;

public class Pessoa {
    protected String nome;
    protected String endereco;

    public void mostrarDados(){
        System.out.println(this.nome + "- Endereço: " + this.endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}