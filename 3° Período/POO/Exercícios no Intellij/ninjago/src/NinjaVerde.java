public class NinjaVerde extends Ninja implements PoderElemental{
    public NinjaVerde(String nome, String cor, String poderElemental){
        super(nome, cor, poderElemental);
    }

    @Override
    public void mostrarNinja(){
        super.mostrarNinja();
        System.out.println("Este é o ninja verde");
    }

    public void spinjitzu(){
        System.out.println("Girando verde");
    }

    public void ataqueElemental(){
        System.out.println("Este é meu ataque verde");
    }

    public void spinjitzuBurst(){
        System.out.println("Burst verde");
    }

    public NinjaDourado transformar(){
        System.out.println("Transformando");
        return new NinjaDourado("Lloyd", "Dourado", "Divino");
    }
}
