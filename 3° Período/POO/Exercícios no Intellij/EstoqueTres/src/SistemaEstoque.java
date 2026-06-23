import java.util.Scanner;

public class SistemaEstoque{
    public static void main(String[] args){
        Estoque produtos = new Estoque();
        Produto p1 = new Produto("Celular", 1500);
        Produto p2 = new Produto("Carro", 1500);
        Produto p3 = new Produto("Telha", 1500);
        Produto p4 = new Produto("Poste", 1500);
        Produto p5 = new Produto("Flor", 1500);
        Produto p6 = new Produto("Carne", 1500);
        Produto p7 = new Produto("Frango", 1500);
        Produto p8 = new Produto("Abelha", 1500);
        Produto p9 = new Produto("Tomate", 1500);
        Produto p10 = new Produto("Feijoada", 1500);

        produtos.adicionarProdutos(p1);
        produtos.adicionarProdutos(p2);
        produtos.adicionarProdutos(p3);
        produtos.adicionarProdutos(p4);
        produtos.adicionarProdutos(p5);
        produtos.adicionarProdutos(p6);
        produtos.adicionarProdutos(p7);
        produtos.adicionarProdutos(p8);
        produtos.adicionarProdutos(p9);
        produtos.adicionarProdutos(p10);
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1: visualizar estoque | 2: alterar preço de produto | 3- comprar produto | ");
            int opcao = scanner.nextInt();
            if (opcao == 1){
                produtos.listarProdutos();
            } else if(opcao == 2){
                produtos.alterarPreco();
            } else if(opcao == 3){

            }
        } } }