
package org.javiersian.model;

public class Caballo extends Animal{
    private double saltoLargo;
    
    public void llevaCarroza(){
        System.out.println("El caballo " + super.getNombre()+ " transporta una carroza");
    }
    public double getSaltoLargo(){
        return this.saltoLargo;
    }
    public void setSaltoLargo(double saltoLargo){
        this.saltoLargo = saltoLargo;
    }
    
}
