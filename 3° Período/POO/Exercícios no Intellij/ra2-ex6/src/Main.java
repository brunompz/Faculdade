import java.util.ArrayList;

public class Main{
    public static void listar(ArrayList<Funcionario> l){
        for (Funcionario f : l){
            f.exibirInformacoes();
            System.out.println("---------------");
        }
    }

    public static void main(String[] args){
        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(new Desenvolvedor("Bruno", 500, 100));
        lista.add(new Designer("Cecília", 40000, 500));
        listar(lista);
    }
}