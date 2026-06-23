public interface Relatorio {
    public void imprimirCabecalho();
    public void imprimirConteudo();

    public default void imprimirRodape(){
        System.out.println("método imprimirRodapé");
    }
}
