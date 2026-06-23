public class Teste {
    public static void main(String[] args){

        Turma turma = new Turma("Turma A: ");

        Aluno a1 = new Aluno("Bruno", 123);
        Aluno a2 = new Aluno("Mario", 456);
        Aluno a3 = new Aluno("Joao", 123);
        Aluno a4 = new Aluno("Cecilia", 756);
        Aluno a5 = new Aluno("Isabela", 113);
        Aluno a6 = new Aluno("Julia", 406);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);
        turma.adicionarAluno(a4);
        turma.adicionarAluno(a5);
        turma.adicionarAluno(a6);

        System.out.println(turma.getNome());
        turma.listarAlunos();

        Turma turma2 = new Turma("Turma B: ");
        Aluno b1 = new Aluno("Bruna", 123);
        Aluno b2 = new Aluno("Maria", 456);
        Aluno b3 = new Aluno("Joana", 123);
        Aluno b4 = new Aluno("Celso", 756);
        Aluno b5 = new Aluno("Isabelo", 113);
        Aluno b6 = new Aluno("Julio", 406);

        turma2.adicionarAluno(b1);
        turma2.adicionarAluno(b2);
        turma2.adicionarAluno(b3);
        turma2.adicionarAluno(b4);
        turma2.adicionarAluno(b5);
        turma2.adicionarAluno(b6);

        System.out.println(turma2.getNome());
        turma2.listarAlunos();

    }
}