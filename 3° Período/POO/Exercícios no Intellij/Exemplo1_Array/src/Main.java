import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Abacaxi");
        frutas.add("Uva");

        System.out.println("Frutas: "+ frutas);
        System.out.println("Comprimento: "+ frutas.size());
        frutas.remove("Banana");
        System.out.println("Após remover Banana: "+ frutas);

        System.out.println("Comprimento: "+frutas.size());
        System.out.println(frutas.get(2));
        frutas.set(3,"Abacate");
        System.out.println("Frutas: "+ frutas);
    }
}