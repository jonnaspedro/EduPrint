import java.util.ArrayList;
import java.util.List;


class Professor extends Pessoa {
    private Disciplina disciplinaResponsavel;
    
    public Professor(String nome, String email) {
        super(nome, email);
    }
    
    public Disciplina getDisciplinaResponsavel() {
        return disciplinaResponsavel;
    }
    
    public void setDisciplinaResponsavel(Disciplina disciplinaResponsavel) {
        this.disciplinaResponsavel = disciplinaResponsavel;
    }
    
    @Override
    public void imprimirDados() {
        System.out.println("Professor: " + getNome());
        System.out.println("Email: " + getEmail());
        if (disciplinaResponsavel != null) {
            System.out.println("Disciplina Responsável: " + disciplinaResponsavel.getNomeDisciplina());
        }
    }
}
