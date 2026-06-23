public class Main{
    public static void main(String[] args){
        Relatorio r = new MeuRelatorio();
        r.imprimirCabecalho();
        r.imprimirConteudo();
        MeuRelatorio s = new MeuRelatorio();
        s.testarMsg();
        s.imprimirCabecalho();
        s.imprimirConteudo();
    }
}