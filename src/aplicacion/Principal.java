package aplicacion;
import dominio.*;
public class Principal {
    public static void main(String[] args) {
        Localidad cantejeiraLocalidad = new Localidad("Cantejeira", 36);
        Localidad lamagrandeLocalidad = new Localidad("Lamagrande", 14);
        System.out.println(cantejeiraLocalidad);
        System.out.println(lamagrandeLocalidad);    
        Municipio balboaMunicipio = new Municipio("Balboa");
            balboaMunicipio.add(cantejeiraLocalidad).add(lamagrandeLocalidad);
        System.out.println(balboaMunicipio);
        
        Localidad bonellaLocalidad = new Localidad("Bonella", 23);
        Localidad follosoLocalidad = new Localidad("Folloso", 6);
        System.out.println(bonellaLocalidad);
        System.out.println(follosoLocalidad); 
        Municipio rielloMunicipio = new Municipio("Riello");
            rielloMunicipio.add (bonellaLocalidad).add(follosoLocalidad);
        System.out.println(rielloMunicipio);

        Provincia leonProvincia = new Provincia("León");
            leonProvincia.add (balboaMunicipio).add(rielloMunicipio);
        System.out.println(leonProvincia);

    }
}
