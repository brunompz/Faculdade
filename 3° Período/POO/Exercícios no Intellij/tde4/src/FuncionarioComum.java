public class FuncionarioComum extends Funcionario{
    public int horasTrabalhadas;
    public float valorHora;

    public FuncionarioComum(){
        this.horasTrabalhadas = 0;
        this.valorHora = 0;
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        s += " | Horas Trabalhadas: "+ this.horasTrabalhadas;
        s += " | Valor da Hora: " + this.valorHora;
        lista.add(s);
        System.out.println(lista);
    }

    public void setHorasTrabalhadas(int horasTrabalhadas){
       this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public void setSalarioFinal(){
        this.salarioFinal = getSalarioBase() + this.valorHora;
    }
}
