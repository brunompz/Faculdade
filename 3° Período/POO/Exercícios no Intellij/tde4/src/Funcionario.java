public class Funcionario extends Pessoa{
    private float salarioBase;
    protected float salarioFinal;

    public Funcionario(){
        this.salarioBase = 0;
        this.salarioFinal = 0;
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        s += " | Salário Base: "+ this.salarioBase;
        s += " | Salário Final: "+ this.salarioFinal;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setSalarioFinal() {
        this.salarioFinal = salarioFinal;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }
}
