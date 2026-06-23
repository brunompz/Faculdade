public class Main{
    public static void main(String[] args){
        Relatorio r = new MeuRelatorio();
        r.imprimirCabecalho();
        r.imprimirConteudo();
        r.imprimirRodape();

        Relatorio s = new NovoRelatorio();
        s.imprimirRodape();
        s.imprimirConteudo();
        s.imprimirCabecalho();
    }
}