
package Util;

import javax.swing.ImageIcon;


public class Imagenes2 {
    public ImageIcon icoImagen;
    
    public ImageIcon pngDado(int Dado){
        switch(Dado){
            case 1: 
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d1.png");
                break;
            case 2:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d2.png");
                break;
            case 3:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d3.png");
                break;
            case 4:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d4.png");
                break;
            case 5:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d5.png");
                break;
            case 6:
                icoImagen = new ImageIcon("C:\\Users\\kpchb\\Desktop\\workSpace\\VirtualMonopoly\\VirtualMonopoly\\VirtualMonopoly\\src\\IMG\\d6.png");
                break;
        }
        return icoImagen;
}
}
