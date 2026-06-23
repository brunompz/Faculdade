public class Main{
  public static void main(String[] args){
    FuncionarioComum f1 = new FuncionarioComum();
    f1.setNome("John Watson da Silva");
    f1.setCpf(12345);
    f1.setSalarioBase(1400);
    f1.setValorHora(50);
    f1.setHorasTrabalhadas(100);
    f1.setSalarioFinal();
    f1.mostrarInformacoes();

    FuncionarioComum f2 = new FuncionarioComum();
    f2.setNome("Dóris Day");
    f2.setCpf(980912);
    f2.setSalarioBase(2500);
    f2.setValorHora(52);
    f2.setHorasTrabalhadas(120);
    f2.setSalarioFinal();
    f2.mostrarInformacoes();

    FuncionarioComum f3 = new FuncionarioComum();
    f3.setNome("James Hunt");
    f3.setCpf(987634);
    f3.setSalarioBase(1800);
    f3.setValorHora(53);
    f3.setHorasTrabalhadas(118);
    f3.setSalarioFinal();
    f3.mostrarInformacoes();

    Gerente f4 = new Gerente();
    f4.setNome("Alberto Roberto");
    f4.setCpf(887721);
    f4.setSalarioBase(5000);
    f4.setValorVendas(52089.20f);
    f4.setPercentualComissao(0.1f);
    f4.setSalarioFinal();
    f4.mostrarInformacoes();

  }
}
