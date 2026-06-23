public class MeuRelatorio implements Relatorio{
    @Override
    public void imprimirCabecalho(){
        System.out.println("método imprimirCabeçalho");
    }

    @Override
    public void imprimirConteudo(){
        System.out.println("método imprimirConteúdo");
    }

    public void testarMsg(){
        System.out.println("teste");
    }
}
