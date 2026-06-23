public class Horista extends Funcionario{
    private int horasTrabalhadas;
    private double valorHora;
    private double salario;

    public Horista(String nome, int horasTrablhadas, double valorHora){
        super(nome);
        this.horasTrabalhadas = horasTrablhadas;
        this.valorHora = valorHora;
        calcularPagamento();
    }

    @Override
    public void calcularPagamento(){
        salario = this.horasTrabalhadas * this.valorHora;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        this.calcularPagamento();
        System.out.println("Pagamento: "+ this.salario);
    }
}
