import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<MeioDeTransporte> Veiculos = new ArrayList<>();
    }

    veiculos.add(new Carro("Civic"););
    veiculos.add(new Bicieta("Caloi elite", true));
    veiculos.add(new Carro("Corolla"));

    for (MeioDeTransporte t : veiculos){
        t.exibirModelo();

        //verifica o tipo real do objeto
        if(t instaceof Carro){
            Carro c = (Carro) t;
            c.acelerar();
        } else if (t instaceof Bicicleta){
            Bicicleta b = (Bicicleta) t;
            b.pedalar();
        }
        System.out.println("------------");
    }
}