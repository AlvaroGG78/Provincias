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

    /*public static void main(String[] args) {
        public void balboaMunicipio(String[] args) {
            Localidad cantejeiraLocalidad = new Localidad("Cantejeira", 36);
            Localidad lamagrandeLocalidad = new Localidad("Lamagrande", 14);
            System.out.println(cantejeiraLocalidad.toString());
            System.out.println(lamagrandeLocalidad.toString());    
            Municipio balboaMunicipio = new Municipio("Balboa", cantejeiraLocalidad,lamagrandeLocalidad);
            System.out.println(balboaMunicipio.toString());
        }

        public static void (String[] args) {
            Localidad bonellaLocalidad = new Localidad("Bonella", 23);
            Localidad castilloLocalidad = new Localidad("El Castillo", 16);
            System.out.println(bonellaLocalidad.toString());
            System.out.println(castilloLocalidad.toString()); 
            Municipio rielloMunicipio = new Municipio("Riello", bonellaLocalidad,castilloLocalidad);
            System.out.println(rielloMunicipio.toString());
        }
    }*/
}
