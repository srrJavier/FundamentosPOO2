package org.javiersian.system;
import org.javiersian.model.Perro;
/**
 *
 * @author Javier Sian
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo estoy en Kinal");
        System.out.println("------PERRO------");
        Perro perro1 = new Perro();
        perro1.setNombre("Max");
        System.out.println("El nombre del perro: " + perro1.getNombre());
        perro1.traerPelota();
        
    }
      
}

