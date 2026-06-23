public class Estoque {
    private Produto localizarProdutoPorNome9String nomeProduto){
    boolean encontrou = false;
    Produto p = null;
    int i=0;
    while ((!(encontrou))&(i<produtos.size())){
        p = produtos.get(i);
        if (p.getNome()==nomeProduto){
            encontrou = true;
        }else{
            i++;
        }
    }
    if (encontrou){
        return p;
    }else{
        return null;
    }
    }

    public void listarProdutosEmEstoque(){
    for(Produto p: produtos){
        String s = 'Produto ';
        s+= "nome: ";
        s+= p.getNome();
        s+="preço: ";
        s+= p.getPreco();
        System.out.println((s));
    }
    }
}