import java.util.ArrayList;

public class Main{
    public static void ouvirAnimais(ArrayList<Pet> l){
        for (Pet p : l){
            p.fazerSom();
        }
    }

    public static void main(){
        ArrayList<Pet> lista = new ArrayList<>();
        lista.add(new Cachorro());
        lista.add(new Papagaio());
        lista.add(new Gato());
        ouvirAnimais(lista);
    }
}