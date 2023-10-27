package aplicacion;
import dominio.*;
import interfaz.*;
import java.util.*;
import java.io.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Provincia> provincias=new ArrayList<Provincia>();
        String peticion;
        Interfaz.procesarPeticion("help",provincias); // para mostrar ayuda
        do {
            peticion=Interfaz.leerPeticion();
        } while (Interfaz.procesarPeticion(peticion,provincias));
    }
    
}
