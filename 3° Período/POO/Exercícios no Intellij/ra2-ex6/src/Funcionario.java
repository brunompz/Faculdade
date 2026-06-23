public abstract class Funcionario {
    private String nome;
    protected double salarioBase;
    protected double salario;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDadosBasicos(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Salário base: "+ this.salarioBase);
    };

    public abstract void exibirInformacoes();
}
