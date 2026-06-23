public class CarroEletrico extends Carro{
    private int autonomiaBateria;

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Autonomia: "+ autonomiaBateria);
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
}
