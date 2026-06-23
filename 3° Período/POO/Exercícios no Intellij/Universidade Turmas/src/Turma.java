import java.util.ArrayList;


public class Turma {
    private String nomeTurma;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Turma(String nomeTurma){
        this.nomeTurma = nomeTurma;
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(Aluno a : alunos){
            System.out.println(a.getNome());
        }
    }

    public String getNome(){
        return nomeTurma;
    }
}
