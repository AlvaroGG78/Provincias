package dominio;
import java.io.Serializable;
public class Localidad implements Serializable{
    private String nombre;
    private int poblacion;
 
    public Localidad(String nombre_,int poblacion_) {
        nombre=nombre_;
        poblacion=poblacion_;
    }
    public String toString(){
        return "Localidad: "+ nombre+" Población: "+poblacion+" habitantes\n";
    }
 
    public int getPoblacion() {
        return poblacion;
    }
 
    public String getNombre() {
        return nombre;
    }
}
