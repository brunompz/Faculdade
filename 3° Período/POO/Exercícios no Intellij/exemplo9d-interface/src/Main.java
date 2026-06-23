public class Main{
    public static void main(String[] args){
        Carro c = new Carro();
        c.ligar();
        c.NivelCombustivel();
        c.desligar();
        c.abastecer();

        Ligavel l = new Carro();
        l.ligar();
        l.desligar();
    }
}