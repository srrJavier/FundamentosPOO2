package org.javiersian.model;

public class Pajaro extends Animal{
     private boolean canto;
    
    public void copiarFrases(){
        System.out.println("El pajaro " + super.getNombre()+ " copia las frases");
    }
    public boolean getCanto(){
        return this.canto;
    }
    public void setCanto(boolean canto){
        this.canto = canto;
    }
           
    
}
