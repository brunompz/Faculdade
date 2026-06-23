public class Gerente extends Funcionario{
    private float valorVendas;
    private float percentualComissao;

    public Gerente(){
        this.valorVendas = 0;
        this.percentualComissao = 0;
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        s += " | Porcentagem das vendas: "+ this.percentualComissao;
        s += " | Valor das Vendas: " + this.valorVendas;
        lista.add(s);
        System.out.println(lista);
    }

    @Override
    public void setSalarioFinal(){
        this.salarioFinal = getSalarioBase() + this.valorVendas * this.percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public void setValorVendas(float valorVendas){
        this.valorVendas = valorVendas;
    }
}
