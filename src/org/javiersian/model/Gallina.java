package org.javiersian.model;

public class Gallina extends Animal{
 private boolean plumas;
    
    public void ponerHuevos(){
        System.out.println("La gallina " + super.getNombre()+ " puso un huevo");
    }
    public boolean getPlumas(){
        return this.plumas;
    }
    public void setPlumas(boolean plumas){
        this.plumas = plumas;
    }
        
}
