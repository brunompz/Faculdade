import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Estoque(){
        produtos = new ArrayList<>();
    }

    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
    }

    public void listarProdutos(){
        for(Produto p : produtos){
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        }
    }

    public void alterarPreco(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o produto deseja editar o preço? ");
        String nomeProduto = scanner.nextLine();
        System.out.println("Preço a ser alterado: ");
        float precoProduto = scanner.nextFloat();
        for(Produto p : produtos){
            if(p.getNome().equalsIgnoreCase(nomeProduto)){
                p.setPreco(precoProduto);
        }

    }


}}
