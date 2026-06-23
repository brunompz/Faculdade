public class Mensalista extends Funcionario{
    private double valorFixo;

    public Mensalista(String nome, double valorFixo){
        super(nome);
        this.valorFixo = valorFixo;
    }

    @Override
    public void calcularPagamento(){
        System.out.println("Pagamento: "+ this.valorFixo);
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Pagamento: "+ this.valorFixo);
    }


}
