public abstract class PersonagemBase{
    protected String nomePersonagem;
    protected int vidaPersonagem;

    public PersonagemBase(String nomePersonagem, int vidaPersonagem){
        this.nomePersonagem = nomePersonagem;
        this.vidaPersonagem = vidaPersonagem;
    }

    public abstract void atacar(PersonagemBase inimigo);

    public void mostrarStatus(){
        System.out.println("Personagem: " + this.nomePersonagem);
        System.out.println("Vida: " + this.vidaPersonagem);
    }

    public void sofrerDano(int nivelDano){
        this.vidaPersonagem -= nivelDano;
        System.out.println("A persona "+this.nomePersonagem+" sofreu " + nivelDano + " de dano.");
        if (this.vidaPersonagem <= 0){
            this.vidaPersonagem = 0;
        }
        mostrarStatus();
        if (this.vidaPersonagem == 0){
            System.out.println(this.nomePersonagem+ " morreu");
        }
    }

    public int getVidaPersonagem(){
        return vidaPersonagem;
    }

    public String getNomePersonagem(){
        return nomePersonagem;
    }

    public void morte(){
        System.out.println(getNomePersonagem()+ " morreu.");
    }

    public void vencedor(){
        System.out.println(getNomePersonagem()+ " venceu.");
    }


}
