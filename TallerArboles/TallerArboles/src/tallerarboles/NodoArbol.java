package tallerarboles;

public class NodoArbol {
    
    String nombre;
    int edad;
    float basico;
    NodoArbol Hizq, Hder;  

    public NodoArbol(String nom, int edad, float bas) {
        this.nombre=nom;
        this.edad=edad;
        this.basico= bas;
        this.Hder=null;
        this.Hizq=null;
    }
    
    public String toString(){
        return nombre + "su dato es:" + "edad: "+ edad + "basico: " + basico;
    }
    
}
