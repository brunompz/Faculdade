public class Designer extends Funcionario implements interfaceCalculavel{
    private double bonus;

    public Designer(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioFinal(){
        return this.salario = this.salarioBase + this.bonus;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirDadosBasicos();
        System.out.println("Salário final: "+ calcularSalarioFinal());
    }
}
