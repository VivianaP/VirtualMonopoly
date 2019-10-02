/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author kpchb
 */
public class TirarDados {
    private int dado1=0;
    private int dado2=0;
    private int sumaDados=0;
    private int cont=0;
    
    public int AmbosDados(){
        dado1 = (int)(Math.random()*6)+1;
        dado2 = (int)(Math.random()*6)+1;
        sumaDados=dado1+dado2;
        
        if(dado1!=dado2){
        return sumaDados;
        }else{
        cont++;
        return sumaDados;
        }
    }
}
