public class Carro implements Ligavel, Tanque{
    @Override
    public void ligar(){
        System.out.println("Ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo");
    }

    @Override
    public double getNivelCombustivel() {
        return 10;
    }

    public void NivelCombustivel(){
        System.out.println(getNivelCombustivel());
    }
}
