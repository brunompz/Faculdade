public class Bicieta extends MeioDeTransporte{
    private boolean temMarcha;

    public Bicicleta(String modelo, boolean temMarcha){
        super(modelo);
        this.temMarcha = temMarcha;
    }
    public void pedalar(){
        System.out.println("Pedalando a bike só no sapatinho");
    }
}
