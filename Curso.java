import java.util.ArrayList;
import java.util.List;


class Curso {
    private String nomeCurso;
    private List<Disciplina> disciplinas;
    
    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.disciplinas = new ArrayList<>();
    }
    
    public String getNomeCurso() {
        return nomeCurso;
    }
    
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
}
