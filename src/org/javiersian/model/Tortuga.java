package org.javiersian.model;

public class Tortuga extends Animal{
    private double mordidaFuerte;
    
    public void Escondite(){
        System.out.println("La tortuga " + super.getNombre()+ " se esconde en su caparazon");
    }
    public double getMordidaFuerte(){
        return this.mordidaFuerte;
    }
    public void serMordidaFuerte(double mordidaFuerte){
        this.mordidaFuerte = mordidaFuerte;
    }
    
}
