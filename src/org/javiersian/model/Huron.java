package org.javiersian.model;

public class Huron extends Animal{
    private boolean trucos;
    
    public void juega(){
        System.out.println("El Huron " + super.getNombre()+ " juega por toda la casa");
    }
    public boolean getTrucos(){
        return this.trucos;
    }
    public void setTrucos(boolean trucos){
        this.trucos = trucos;
    }
        
    
}
