public abstract class Ninja {
    private String nome;
    private String cor;
    private String poderElemental;

    public Ninja(String nome, String cor, String poderElemental){
        this.nome = nome;
        this.cor = cor;
        this.poderElemental = poderElemental;
    }

    public abstract void spinjitzu();

    public void mostrarNinja(){
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Poder Elemental: " + poderElemental);
    }

}
