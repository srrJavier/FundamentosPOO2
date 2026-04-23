package org.javiersian.model;

public class Gato extends Animal{
    private double largasGarras;
    
    public void arañazo(){
        System.out.println("El gato " + super.getNombre() + " ha arañado");
    }
    
    public double getLargasGarras(){
        return this.largasGarras;
    }
    
    public void setLargasGarras(double largasGarras){
        this.largasGarras = largasGarras;
    }
}
