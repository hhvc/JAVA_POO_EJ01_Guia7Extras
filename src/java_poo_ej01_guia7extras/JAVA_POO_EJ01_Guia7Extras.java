/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
definir los métodos getters y setters correspondientes.
 */
package java_poo_ej01_guia7extras;

import Entidad.Cancion;

/**
 * Ejercicio curso EGG. Guia 7, ejercicio extra 01
 * @author hecto
 */
public class JAVA_POO_EJ01_Guia7Extras {

    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("El hombre del Traje Gris", "Joaquín Sabina");
        
        cancion1.setAutor("Andrés Calamaro");
        cancion1.setTitulo("Por Mirarte");
        
        System.out.println("la colección actual comprende los siguientes discos:\n- "+cancion1.getTitulo()+". Autor: " + cancion1.getAutor() +"\n- "+cancion2.getTitulo()+". Autor: "+cancion2.getAutor());
                
    }
    
}
