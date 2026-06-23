import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Mensalista("Bruno", 40000));
        lista.add(new Horista("Cecília", 120, 500));
        for (Funcionario f : lista){
            f.exibirDados();
        }
    }
}
