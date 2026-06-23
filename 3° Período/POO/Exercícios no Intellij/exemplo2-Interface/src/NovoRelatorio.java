public class NovoRelatorio implements Relatorio{
    @Override
    public void imprimirCabecalho(){
        System.out.println("método imprimirCabeçalho");
    }

    @Override
    public void imprimirConteudo(){
        System.out.println("método imprimirConteúdo");
    }

    @Override
    public void imprimirRodape() {
        System.out.println("Novo imprimirRodape");
    }
}
