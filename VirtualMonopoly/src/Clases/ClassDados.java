package Clases;

public class ClassDados {
    private int dado1=0;
    private int dado2=0;
    private int sumaDados=0;
    
    public int SumaDados(int dado1, int dado2){
        sumaDados=dado1+dado2;
        return sumaDados;
    }
    
    public boolean Iguales(int dado1, int dado2){
        if(dado1==dado2)return true;
        else return false;
    }
    
    public int GeneraPrimer(){
      dado1 = (int)(Math.random()*6)+1;
      return dado1;
    }
    
    public int GeneraSecun(){
      dado2 = (int)(Math.random()*6)+1;
      return dado2;
    }
}