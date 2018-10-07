
package Logica;

public class Luigi extends Personaje{
    
    @Override
    public void setApariencia(String apariencia){
        
        this.apariencia="Luigi"+apariencia;
        
    }
    
    @Override
    public void setDescripcion(){
        
        this.descripcion="fontanero vestido de traje verde y mas alto que su hermano de Mario";
        
    }
    
    @Override
    public void setSalto(){
        
        this.salto=7;
        
    }
    
    @Override
    public void setVelocidad(){
        
        this.velocidad=4;
        
    }
    
}
