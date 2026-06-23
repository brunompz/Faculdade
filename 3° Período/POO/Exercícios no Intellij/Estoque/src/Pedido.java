public class Pedido {
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade){
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularTotal(){
        return produto.getPreco() * quantidade;
    }

    public void mostrarResumo(){
        System.out.println("Cliente: "+ cliente.getNome());
        System.out.println("Email: " +cliente.getEmail());
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Total: R$ "+calcularTotal());
    }
}
