
package Logica;

public class Mario extends Personaje{
   
    @Override
    public void setApariencia(String apariencia){
        
        this.apariencia="Mario"+apariencia;
        
    }
    
    @Override
    public void setDescripcion(){
        
        this.descripcion="fontanero vestido de traje rojo y azul en busca de rescatar a Peach";
        
    }
    
    @Override
    public void setSalto(){
        
        this.salto=5;
        
    }
    
    @Override
    public void setVelocidad(){
        
        this.velocidad=5;
        
    }
    
}
