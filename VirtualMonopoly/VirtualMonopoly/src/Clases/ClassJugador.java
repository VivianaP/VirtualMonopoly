
package Clases;

import java.awt.Color;


public class ClassJugador {
    
    private Integer posicion;
    private Color color;
    private String nombre;

    public ClassJugador() {
    }

    public ClassJugador(Integer posicion, Color color, String nombre) {
        this.posicion = posicion;
        this.color = color;
        this.nombre = nombre;
    }
  
    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = this.posicion + posicion;
        if(this.posicion>40)this.posicion=this.posicion-40;
      
    }
    
    public int avanzar (int dados){
        return dados;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
