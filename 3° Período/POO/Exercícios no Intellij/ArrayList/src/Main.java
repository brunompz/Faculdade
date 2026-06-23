import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("Texto 1");
        arr1.add("Texto 2");
        arr1.add("Texto 3");

        System.out.println("Comprimento do arr1: " + arr1.size());

        System.out.println("Item da posição 2: "+ arr1.get(2));
        System.out.println("Item da posição 0: "+ arr1.get(0));

        arr1.set(0, "Texto 1.1");

        System.out.println("Novo item da posição 0: "+ arr1.get(0));


    }
}
