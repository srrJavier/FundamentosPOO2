package org.javiersian.model;

public class Perro extends Animal {
    private boolean entrenado;
    
    public void traerPelota(){
        System.out.println("El perro " +super.getNombre()+" trae la pelota");
    }
    public boolean getEntrenado(){
        return this.entrenado;
    }
    public void setEntrenado(boolean entrenado){
        this.entrenado = entrenado;
    }
           
}
