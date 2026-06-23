import java.util.ArrayList;

public class GestaoFrota{
    public static void main(String[] args){
        ArrayList<VeiculoAereo> lista = new ArrayList<>();
        lista.add(new DroneCarga());
        lista.add(new DroneCarga());
        listar(lista);
    }

    public static void listar(ArrayList<VeiculoAereo> l){
        for (VeiculoAereo v : l){
            v.prepararMotores();
            v.realizarEntrega();
            System.out.println("-----------------");
        }
    }
}