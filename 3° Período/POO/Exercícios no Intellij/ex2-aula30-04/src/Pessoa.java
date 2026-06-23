public class Pessoa{
    private String nome;
    private String endereco;
    private String numero;

    public Pessoa(){
        this.nome = null;
        this.endereco = "";
        this.numero = "";
    }

    public void mostrar(){
        System.out.println("Nome" + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número: " + numero);
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}