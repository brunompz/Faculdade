public class Mago extends PersonagemBase implements CouracaGolpeEspecial{
    public Mago(String nome, int vidaPersonagem){
        super(nome, vidaPersonagem);
    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
    }

    @Override
    public void atacar(PersonagemBase inimigo){
        System.out.println("Aplicou Abracadabra");
        inimigo.sofrerDano(5);
    }

    @Override
    public void atacarGolpeEspecial(PersonagemBase inimigo){
        System.out.println("Aplicou Feitiço de Merlin");
        inimigo.sofrerDano(50);
    }
}
