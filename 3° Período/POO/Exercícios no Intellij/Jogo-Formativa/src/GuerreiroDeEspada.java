public class GuerreiroDeEspada extends PersonagemBase implements CouracaGolpeEspecial{
    public GuerreiroDeEspada(String nome, int vidaPersonagem){
        super(nome, vidaPersonagem);
    }

    @Override
    public void mostrarStatus(){
        super.mostrarStatus();
    }

    @Override
    public void atacar(PersonagemBase inimigo){
        System.out.println("Aplicou Ataque com Espada");
        inimigo.sofrerDano(10);
    }

    @Override
    public void atacarGolpeEspecial(PersonagemBase inimigo){
        System.out.println("Aplicou Golpe de Thor");
        inimigo.sofrerDano(30);
    }
}
