package dominio;
import java.util.*;

public class Municipio{
	private String nombre;
	private ArrayList <Localidad> localidades;
	public Municipio (String nombre.){
		nombre = nombre_;
		localidades = new ArrayList <Localidad>();
	}
	public Municipio addLocalidad(Localidad l){
		localidades.add (l);
		return this;
	}
	public String toString(){
		String cad = "Localidad: " + nombre + " municipios: \n";
		for (Localidad l:localidades)
			cad + =(l + "\n");
		return cad;
	}


}
