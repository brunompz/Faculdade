import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Forma> lista = new ArrayList<>();
        lista.add(new Circulo(20));
        lista.add(new Retangulo(5, 4));

        for (Forma f : lista){
            f.calcularArea();
        }
    }
}
