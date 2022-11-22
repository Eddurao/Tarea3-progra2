package expendedor2d;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Deposito {              //QUITARE ANCHO Y LARGO
    private int code;
    private int cargo;
    private ArrayList <Bebida> ALbebidas;
    
    public Deposito(int code, int cargo) {
        this.code = code;
        this.cargo = cargo;
        ALbebidas = new ArrayList <>();
        rellenar();
    }
    
    
    
    public void paint(Graphics g){
        
        for(int i=0;i<ALbebidas.size();i++){
            (ALbebidas.get(i)).paint(g);
            
            
        }

                                                  //AQUI HACER EL PRINTA BEBIDAS
        
    }
    public void rellenar(){//rellena con bebidas del tipo code, cantidad cargo
       for(int i=0;i<cargo;i++){
           if(ALbebidas.size() == cargo){break;} //si llega a tope cancela
           if(code == 1){ALbebidas.add(new CocaCola(100,55+(155/cargo)*i));}  //AQUI SETEAR SUS POSICIONES
           if(code == 2){ALbebidas.add(new Sprite(150,55+(155/cargo)*i));}
           if(code == 3){ALbebidas.add(new Fanta(200,55+(155/cargo)*i));}
           if(ALbebidas.size() == cargo){break;}  //si llega a tope cancela
       } 
                                //CAMBIAR : tira una sola bebida ????
                                                 //ESTE ES EL ALMACENABEBIDAS
    }
    public Bebida getBebida(){
        if(ALbebidas.size() == 0)
            return null;
                                                 //SACA BEBIDA
        else
            return ALbebidas.remove(0);
    }
    
    
    public int getSize(){
        return ALbebidas.size();
    }
    
    
    
}
