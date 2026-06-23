public class Carro extends Veiculo{
    private int portas;

    public Carro(){
        portas = 0;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Portas: " + portas);
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
