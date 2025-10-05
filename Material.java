import java.util.ArrayList;
import java.util.List;


class Material {
    private String nomeMaterial;
    private String tipo;
    
    public Material(String nomeMaterial, String tipo) {
        this.nomeMaterial = nomeMaterial;
        this.tipo = tipo;
    }
    
    public String getNomeMaterial() {
        return nomeMaterial;
    }
    
    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
