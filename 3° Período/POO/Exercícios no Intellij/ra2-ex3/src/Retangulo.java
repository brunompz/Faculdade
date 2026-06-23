public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea(){
        this.area = this.base * this.altura;
        System.out.println("Área = "+ this.area);
    }
}
