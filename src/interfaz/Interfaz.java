package interfaz;
import dominio.*;
import java.util.*;
import java.io.*;

public class Interfaz {
    private ArrayList<Provincia> l;
    private Scanner sc = new Scanner(System.in);
    public Interfaz(){
        File f = new File("provincias.dat");
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
            l=(ArrayList<Provincia>)ois.readObject();
            ois.close();
        } catch (Exception e) {
            l=new ArrayList<Provincia>();
        }
    }

    public void grabar(){
        File f = new File("provincias.dat");
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(l);
            oos.close();
        } catch (Exception e) {
            System.out.print("Error al grabar");
        }
    }
    public boolean procesarPeticion(String peticion) {
        String [] p=peticion.split(" ");
        if (p.length==1)
            if (p[0].equals("addProvincia"))
                aniadirProvincia();
            else if (p[0].equals("addMunicipio"))
                aniadirMunicipio();
            else if (p[0].equals("addLocalidad"))
                aniadirLocalidad();
            else if (p[0].equals("leer"))
                leer();
            else if (p[0].equals("list"))
                System.out.print (l);
            else if (p[0].equals("help"))
                System.out.print("introduzca una de las siguientes peticiones:\n addProvincia nombre: añadir provincia\n addMunicipio nombre: añadir Municipio\n addLocalidad\n list: listar el contenido\n leer: lectura inicial\n exit: salir\n");
            else if (p[0].equals("exit")){
                grabar();
                return false; //no se procesarán más peticiones.
            }
            else {
                System.out.print("petición erronea");
                procesarPeticion("help");
            }
        else {
            System.out.print("petición erronea");
            procesarPeticion("help");
        }
        return true; //en todos los casos debe seguir pidiendo y procesando peticiones.
    }
    public void aniadirProvincia(){
        System.out.print("Introduzca el nombre de la provincia: ");
        String nombre = sc.nextLine();
        Provincia provincia = new Provincia(nombre);
        l.add(provincia);
    }

    public void aniadirMunicipio(){
        System.out.print("Introduzca el nombre del municipio: ");
        String nombre = sc.nextLine();
        Municipio municipio = new Municipio(nombre);
        for (int i=0;i<l.size();i++)
            System.out.println(i+": " + l.get(i).getNombre());
        System.out.print("Introduzca el número de la provincia: ");
        int i = sc.nextInt();
        sc.nextLine();
        l.get(i).add(municipio);
    }

    public void aniadirLocalidad(){
        System.out.print("Introduzca el nombre de la localidad: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca el número de habitantes de la localidad: ");
        int poblacion = sc.nextInt();
        Localidad localidad = new Localidad(nombre, poblacion);
        for (int i=0;i<l.size();i++)
            System.out.println(i+": "+ l.get(i).getNombre());
        System.out.print("Introduzca el número de la Provincia: ");
        int i = sc.nextInt();
        sc.nextLine();
        for (int j=0;j<l.get(i).size();j++)
            System.out.println(j+": " + l.get(i).getMunicipio(j).getNombre());
        System.out.print("Introduzca el número del Municipio: ");
        int j=sc.nextInt();
        sc.nextLine();
        l.get(i).getMunicipio(j).add(localidad);
    }
    
    public String leerPeticion() {
        System.out.print("?>");
        String cadena = sc.nextLine();
        return cadena;
    }

    /*public static ArrayList<Provincia> leer() {
        ArrayList<Provincia> provincias = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nomProvincia;
    }*/
    
    public void leer(){
        String nomProvincia, nomMunicipio, nomLocalidad;
        int habLocalidad;
       do {
            System.out.println("Nombre de la provincia: (Enter para finalizar.)");
            nomProvincia = sc.nextLine();
            if (!nomProvincia.isEmpty()) {
                Provincia P = new Provincia(nomProvincia);
                do {
                    System.out.println("Nombre del municipio: (Enter para finalizar.)");
                    nomMunicipio = sc.nextLine();
                    if (!nomMunicipio.isEmpty()) {
                        Municipio M = new Municipio(nomMunicipio);
                        do {
                            System.out.println("Nombre de la localidad: (Enter para finalizar.)");
                            nomLocalidad = sc.nextLine();
                            if (!nomLocalidad.isEmpty()) {
                                habLocalidad = sc.nextInt();
                                Localidad L = new Localidad(nomLocalidad, habLocalidad);
                                M.addLocalidad(L);
                            }
                        } while (!nomLocalidad.isEmpty());    
                        P.addMunicipio(M);
                    }
                } while (!nomMunicipio.isEmpty());
                l.add(P);
            }
        } while (!nomProvincia.isEmpty());
    }      
}




/*
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
     }*/  


                
                    
