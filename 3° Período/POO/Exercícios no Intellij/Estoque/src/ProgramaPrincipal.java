public class ProgramaPrincipal {
    public static void main(String[] args){
        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Mouse", 100);

        Cliente c1 = new Cliente("Bruno", "bruno@email.com");
        Cliente c2 = new Cliente("Maria", "maria@email.com");

        Pedido pedido1 = new Pedido(c1, p1, 1);
        Pedido pedido2 = new Pedido(c2, p2, 2);

        pedido1.mostrarResumo();
        pedido2.mostrarResumo();
    }
}
