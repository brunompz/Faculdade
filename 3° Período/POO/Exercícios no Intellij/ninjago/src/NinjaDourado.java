public class NinjaDourado extends NinjaVerde{
    public NinjaDourado(String nome, String cor, String poderElemental){
        super(nome, cor, poderElemental);
    }

    @Override
    public void mostrarNinja(){
        super.mostrarNinja();
        System.out.println("Poder dourado avante");
    }

    @Override
    public void spinjitzu(){
        System.out.println("Girando dourado");
    }

    @Override
    public void ataqueElemental(){
        System.out.println("Este é meu ataque dourado");
    }

    @Override
    public void spinjitzuBurst(){
        System.out.println("Burst dourado");
    }
}
