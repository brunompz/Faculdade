public class PessoaFisica extends Pessoa{
    private int cpf;

    public PessoaFisica(){
        this.cpf = 0;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Classe PessoaFísica");
        System.out.println("CPF: " + cpf);
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
