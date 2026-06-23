import static java.lang.Math.PI;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
        this.area = PI * (this.raio * this.raio);
        System.out.println("Área = "+ this.area);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
