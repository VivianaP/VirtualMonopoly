
package Clases;

import Util.Lista;
import Vistas.formJuego;
import java.awt.Color;
import javax.swing.JPanel;


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
    
    public void avanzar (Lista casillas){
              
      if(this.getPosicion()>-1){
            JPanel panel = (JPanel) casillas.get(this.getPosicion());
            panel.setBackground(new java.awt.Color(220,245,245));
        }

        int valorDado = (int) Math.floor(Math.random()*(11-1+1)+1);
        this.setPosicion(valorDado);
        formJuego.jLabelResultadoDado.setText(""+valorDado);
        JPanel panel = (JPanel) casillas.get(this.getPosicion());
        panel.setBackground(this.getColor());
       
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
