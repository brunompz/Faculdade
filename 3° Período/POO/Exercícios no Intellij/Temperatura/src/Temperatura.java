public class Temperatura {
    private double valor;

    public Temperatura(double valor){
        this.valor = valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        verificarTemperatura();
        return valor;
    }

    public void verificarTemperatura(){
        if (this.valor < -273){
            System.out.println("Valor inválido, abaixo de zero absoluto(-275°C): ");

        } else{
            System.out.println("Valor dentro do limite: ");

        }
        exibirTemperatura();
    }

    public void exibirTemperatura(){
        System.out.println(valor + " °C.");
    }
}
