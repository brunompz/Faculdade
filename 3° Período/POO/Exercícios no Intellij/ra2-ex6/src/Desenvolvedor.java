public class Desenvolvedor extends Funcionario implements interfaceCalculavel{
    private int horasExtras;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras){
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalarioFinal(){
        return this.salario = this.salarioBase * this.horasExtras;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirDadosBasicos();
        System.out.println("Salário: "+calcularSalarioFinal());
    }
}
