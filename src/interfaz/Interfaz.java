package interfaz;
import dominio.*;
import java.util.*;
import java.io.*;

public class Interfaz {
    public static ArrayList<Provincia> leer() {
        ArrayList<Provincia> provincias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nomProvincia;

        do {
            System.out.println("Nombre de la provincia: (Enter para finalizar.)");
            nomProvincia = sc.nextLine();
            if (!nomProvincia.isEmpty()) {
                Provincia P = new Provincia(nomProvincia);

                String nomMunicipio;
                do {
                    System.out.println("Nombre del municipio: (Enter para finalizar.)");
                    nomMunicipio = sc.nextLine();
                    if (!nomMunicipio.isEmpty()) {
                        Municipio M = new Municipio(nomMunicipio);

                        String nomLocalidad;
                        do {
                            System.out.println("Nombre de la localidad: (Enter para finalizar.)");
                            nomLocalidad = sc.nextLine();
                            if (!nomLocalidad.isEmpty()) {
                                Localidad L = new Localidad(nomLocalidad, 0);
                                M.addLocalidad(L);
                            }
                        } while (!nomLocalidad.isEmpty());
                        
                        P.addMunicipio(M);
                    }
                } while (!nomMunicipio.isEmpty());

                provincias.add(P);
            }
        } while (!nomProvincia.isEmpty());

        return provincias;
    }

    public static void main(String[] args) {
        ArrayList<Provincia> provincias = leer();
        System.out.println("Datos ingresados:");

            for (Provincia provincia : provincias) {
                System.out.println("Provincia: " + provincia.getNombre());
                    
                    for (Municipio municipio : provincia.getMunicipios()) {
                        System.out.println("  Municipio: " + municipio.getNombre());
                            
                            for (Localidad localidad : municipio.getLocalidades()) {
                                System.out.println("    Localidad: " + localidad.getNombre());
                            }
                    }
            }
     }
}




/*package interfaz;
import dominio.*;
import java.util.*;
import java.io.*;

public class Interfaz{
    public static ArrayList<Provincia> leer(){
        ArrayList<Provincia> provincias = new ArrayList<>();
        Scanner sc = new Scanner (System.in);

        do{
        System.out.println("Nombre de la provincia: (Enter para finalizar.)");
        String nomProvincia = sc.nextLine();
            if(nomProvincia != ""){
                Provincia P = new Provincia (nomProvincia);
                do{
                    // Leer Municipio de la Provincia.
                    System.out.println("Nombre del municipio: (Enter para finalizar.)");
                    String nomMunicipio = sc.nextLine();
                        if(nomMunicipio != ""){
                            Municipio M = new Municipio(nomMunicipio);
                            P.addMunicipio(M);
                            do{
                                System.out.println("Nombre del municipio: (Enter para finalizar.)");
                                String nomLocalidad = sc.nextLine();
                                    if(nomLocalidad != ""){
                                        Localidad L = new Localidad(nomLocalidad);
                                        M.addLocalidad(L);
                                    }
                            }
                        }
                provincias.add (P);
                } while (nomMunicipio != "");
            }  // if (nomProvincia != "")
        }while (nomProvincia != "");
                return provincias;
    }
}*/

        // sc.next(); ---> Lee la cadena hasta un separador.
        // sc.nextLines(); ---> Lee hasta el salto de línea.
        /*pseudocodigo
        repetir
            leer nombre de provincias
                si nombre == ""{
                    siguiente};
                si no{
                    crear objeto provincia;
                    repetir
                        leer nombre municipio;*/
                
                    
