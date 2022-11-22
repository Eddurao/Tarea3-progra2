package expendedor2d;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.util.Random;
import java.lang.Math;

public class DepositoVuelto {
    public ArrayList <Moneda> ALvuelto;
    
    public DepositoVuelto(){
        
        ALvuelto = new ArrayList <>();
        
    }
    
    public void paint(Graphics g){      //no funciona
        
        System.out.println("SE LLAMO");
       for(int i=0; i<ALvuelto.size() ; i++  ){
       (ALvuelto.get(i)).paint(g);
           
       
       
       
       }
        
        
    }
    public void Devolucion(Moneda money){
        ALvuelto.add(money);
    }
    public void BotarMoneda(){  System.out.println("botarmonea");
         
    
         ALvuelto.add(new Moneda100((int) (272 + Math.random()*80), (int) (310+Math.random()*80)));  //aqui setearemos moneas
         System.out.println("");
         
    }
    
    public Moneda sacarMoneda(){
        if(ALvuelto.isEmpty()){
            return null;                              //SACAR MONEA
        }else{                                       
            return ALvuelto.remove(0);
        }
    }
    
    public boolean noqueda(){
        if(ALvuelto.isEmpty()){
            return true;                              //SACAR MONEA
        }else {return false;}                                       
            
        
    }
    
    
    
    
   
}
