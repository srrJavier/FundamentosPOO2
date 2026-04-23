package org.javiersian.system;
import org.javiersian.model.Perro;
import org.javiersian.model.Conejo;
import org.javiersian.model.Gato;
import org.javiersian.model.Pajaro;
import org.javiersian.model.Caballo;
import org.javiersian.model.Tortuga;
import org.javiersian.model.Gallina;
import org.javiersian.model.Hamster;
import org.javiersian.model.Huron;
import org.javiersian.model.Cerdos;
/**
 *
 * @author Javier Sian
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo estoy en Kinal");
        System.out.println("------Perro------");
        Perro perro1 = new Perro();
        perro1.setNombre("Max");
        System.out.println("El nombre del perro: " + perro1.getNombre());
        perro1.traerPelota();
        
        System.out.println("------Conejo------");
        Conejo conejo1 = new Conejo();
        conejo1.setNombre("Snowball");
        System.out.println("Nombre del conejo: " + conejo1.getNombre());
        conejo1.comerZanahoria();
        
        System.out.println("------Gato------");
        Gato gato1 = new Gato();
         gato1.setNombre("Pelusa");
        System.out.println("Nombre del gato: " + gato1.getNombre());
        gato1.arañazo();
        
        System.out.println("------Pajaro------");
        Pajaro pajaro1 = new Pajaro();
         pajaro1.setNombre("Piolin");
        System.out.println("Nombre del Pajaro: " + pajaro1.getNombre());
        pajaro1.copiarFrases();
       
        System.out.println("------Caballo------");
        Caballo caballo1 = new Caballo();
        caballo1.setNombre("Aquiles");
        System.out.println("Nombre del Caballo: " + caballo1.getNombre());
        caballo1.llevaCarroza();
       
        System.out.println("------Tortuga------");
        Tortuga tortuga1 = new Tortuga();
        tortuga1.setNombre("Donatello");
        System.out.println("Nombre de la Tortuga: " + tortuga1.getNombre());
        tortuga1.Escondite();
        
        System.out.println("------Gallina------");
        Gallina gallina1 = new Gallina();
        gallina1.setNombre("Coco");
        System.out.println("Nombre de la Gallina: " + gallina1.getNombre());
        gallina1.ponerHuevos();
        
        System.out.println("------Hamster------");
        Hamster hamster1 = new Hamster();
        hamster1.setNombre("Rusty");
        System.out.println("Nombre del Hamster: " + hamster1.getNombre());
        hamster1.correRueda();
        
        System.out.println("------Huron------");
        Huron huron1 = new Huron();
        huron1.setNombre("Loki");
        System.out.println("Nombre del Huron: " + huron1.getNombre());
        huron1.juega();
        
         System.out.println("------Cerdo------");
        Cerdos cerdo1 = new Cerdos();
        cerdo1.setNombre("Porky");
        System.out.println("Nombre del Cerdo: " + cerdo1.getNombre());
        cerdo1.juegaEnLodo();
        
    }
      
}

