package dominio;
import java.io.Serializable;

public class Localidad implements Serializable {
	private String nombre_localidad;
	private int habitantes_localidad;
	
	public Localidad(String nombre, int habitantes_localidad){
        this.nombre_localidad = nombre;
		//this.habitantes_localidad = habitantes_localidad;
    }
	public void setNombre(String nombre){
		this.nombre_localidad = nombre;
	}
	public void setHabitantes_localidad(int habitantes_localidad){
		this.habitantes_localidad = habitantes_localidad;
	}
	public String getNombre(){
		return this.nombre_localidad;
	}
	public int getHabitantes_localidad(){
		return this.habitantes_localidad;
	}
	public String toString(){
		String result =  ("La localidad " + this.nombre_localidad + " tiene " + this.habitantes_localidad + " habitantes");
		return result;
	}
}
