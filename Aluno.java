import java.util.ArrayList;
import java.util.List;


class Aluno extends Pessoa {
    private String matricula;
    private List<Disciplina> disciplinas;
    
    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("Aluno: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Disciplinas matriculadas:");
        for (Disciplina d : disciplinas) {
            System.out.println("\t- " + d.getNomeDisciplina());
        }
    }
}
