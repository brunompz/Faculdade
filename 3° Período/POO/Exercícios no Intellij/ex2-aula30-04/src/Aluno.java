public class Aluno extends PessoaFisica{
    private int matricula;
    private int qntMaterias;

    public Aluno(){
        this.matricula = 0;
        this.qntMaterias = 0;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Classe Aluno");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Quantidade matérias: "+ qntMaterias);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setQntMaterias(int qntMaterias) {
        this.qntMaterias = qntMaterias;
    }
}
