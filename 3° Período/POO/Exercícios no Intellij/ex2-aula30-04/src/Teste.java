public class Teste {
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.setNome("Bruno");
        a1.setMatricula(21);
        a1.setCpf(1234);
        a1.setEndereco("Rua Miguel");
        a1.setNumero("159");
        a1.setQntMaterias(5);
        a1.mostrar();

        Aluno a2 = new Aluno();
        a2.setNome("Ceci");
        a2.setMatricula(20);
        a2.setCpf(1234);
        a2.setEndereco("Rua José");
        a2.setNumero("159");
        a2.setQntMaterias(6);
        a2.mostrar();

        Aluno a3 = new Aluno();
        a3.setNome("nós");
        a3.setMatricula(71);
        a3.setCpf(1234);
        a3.setEndereco("Rua Para Sempre");
        a3.setNumero("159");
        a3.setQntMaterias(7);
        a3.mostrar();
    }

}
