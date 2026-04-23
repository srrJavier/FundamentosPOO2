package org.javiersian.model;

public class Cerdos extends Animal{
     private boolean olfato;
    
    public void juegaEnLodo(){
        System.out.println("El Cerdo " + super.getNombre()+ " se revuelve entre el lodo");
    }
    public boolean getOlfato(){
        return this.olfato;
    }
    public void setOlfato(boolean olfato){
        this.olfato = olfato;
    }
    
}
