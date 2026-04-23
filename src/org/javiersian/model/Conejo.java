package org.javiersian.model;

public class Conejo extends Animal {
    private double patasFuertes;
    
    public void comerZanahoria(){
        System.out.println("El conejo " + super.getNombre()+ " se come la zanahoria");
    }
    public double getPatasFuertes(){
        return this.patasFuertes;
    }
    public void setPatasFuertes(double patasFuertes){
        this.patasFuertes = patasFuertes;
    }
    
    
    
}
