import java.util.ArrayList;
import java.util.List;


class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;
    private Professor professor;
    private List<Material> materiais;
    
    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.materiais = new ArrayList<>();
    }
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public List<Material> getMateriais() {
        return materiais;
    }
    
    public void adicionarMaterial(Material material) {
        this.materiais.add(material);
    }
}
