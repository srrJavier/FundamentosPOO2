package org.javiersian.model;

public class Hamster extends Animal{
 private boolean cachetes;
    
    public void correRueda(){
        System.out.println("El " + super.getNombre()+ " corre en la rueda que tiene");
    }
    public boolean getCachetes(){
        return this.cachetes;
    }
    public void setCachetes(boolean cachetes){
        this.cachetes = cachetes;
    }
        
}
