import java.util.ArrayList;

public class Main{
    public static void listar(ArrayList<Dispositivo> l){
        for (Dispositivo d : l){
            d.ligar();
            d.desligar();
        }
    }

    public static void main(String[] args){
        ArrayList<Dispositivo> lista = new ArrayList<>();
        lista.add(new Televisao());
        lista.add(new Computador());
        listar(lista);
    }
}