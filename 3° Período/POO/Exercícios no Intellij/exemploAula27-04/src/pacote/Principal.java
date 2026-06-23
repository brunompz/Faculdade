package pacote;

public class Principal {
    public static void main(String[] args){

        Aluno a;
        a = new Aluno();
        a.setNome("Cecília");
        a.setEndereco("Rua Miguel Bakum, 159");
        a.setMatricula("20050525");
        a.mostrarDados();

        Aluno a1 = new Aluno();
        a1.setNome("Bruno");
        a1.setEndereco("Rua José Martinho Lissa");
        a1.setMatricula("20041230");
        a1.mostrarDados();
    }

}
