public class Classe2 extends Classe1{
    private double valorimposto;
    private double percentualImposto;

    public Classe2(){
        this.valorimposto = 0.0;
    }

    @Override
    public void calcular(){
        super.calcular();
        //valor do imposto é obtido a partir do valorPercentual
        valorimposto = getValorPercentual() * percentualImposto;
    }

    @Override
    public void mostrar(){
        this.calcular();
        super.mostrar();
        System.out.println("Mostrar na classe Classe2");
        System.out.println("Valor imposto: " + this.valorimposto);
    }

    public double getValorimposto(){
        return valorimposto;
    }

    public void setValorimposto(double valorimposto) {
        this.valorimposto = valorimposto;
    }

    public double getPercentualImposto() {
        return percentualImposto;
    }

    public void setPercentualImposto(double percentualImposto) {
        this.percentualImposto = percentualImposto;
    }
}
