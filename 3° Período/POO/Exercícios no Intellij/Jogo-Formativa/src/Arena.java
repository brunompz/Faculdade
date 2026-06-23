public class Arena{
    public static void main(String[] args){
        PersonagemBase mago = new Mago("Bruxa Cecília", 100);
        PersonagemBase guerreiro = new GuerreiroDeEspada("Guerreiro Bruno", 100);
        while (true) {
            mago.mostrarStatus();
            guerreiro.mostrarStatus();
            mago.atacar(guerreiro);
            guerreiro.atacar(mago);
            ((CouracaGolpeEspecial)mago).atacarGolpeEspecial(guerreiro);
            ((CouracaGolpeEspecial)guerreiro).atacarGolpeEspecial(mago);
            if (mago.getVidaPersonagem() == 0) {
                mago.morte();
                guerreiro.vencedor();
                break;
                } else if (guerreiro.getVidaPersonagem() == 0) {
                guerreiro.morte();
                mago.vencedor();
                break;
            }
        }
    }
}