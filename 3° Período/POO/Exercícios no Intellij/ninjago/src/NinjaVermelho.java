public class NinjaVermelho extends Ninja implements PoderElemental{
    public NinjaVermelho(String nome, String cor, String poderElemental){
        super(nome, cor, poderElemental);
    }

    @Override
    public void mostrarNinja(){
        super.mostrarNinja();
        System.out.println("Este é o ninja do fogo");
    }

    @Override
    public void ataqueElemental(){
        System.out.println("Este é meu ataque vermelho");
    }

    @Override
    public void spinjitzuBurst(){
        System.out.println("Burst vermelho");
    }

    @Override
    public void spinjitzu(){
        System.out.println("Girando vermelho");
    }
}
