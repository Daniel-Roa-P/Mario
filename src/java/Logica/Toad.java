
package Logica;

public class Toad extends Personaje{
    
    @Override
    public void setApariencia(String apariencia){
        
        this.apariencia="Toad"+apariencia;
        
    }
    
    @Override
    public void setDescripcion(){
        
        this.descripcion="subdito del reino champiñon con cabeza en forma de hongo muy veloz y con pies cortos";
        
    }
    
    @Override
    public void setSalto(){
        
        this.salto=3;
        
    }
    
    @Override
    public void setVelocidad(){
        
        this.velocidad=8;
        
    }
    
}
