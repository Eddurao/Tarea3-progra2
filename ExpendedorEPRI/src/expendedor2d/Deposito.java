package expendedor2d;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Deposito {
    private int x,  y, largo, ancho;
    private ArrayList <Bebida> bebida;
    
    public Deposito(int x, int y, int ancho, int largo){
        this.x=x;this.y=y;
        this.ancho = ancho; this.largo = largo;
        bebida = new ArrayList <Bebida>();
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x, y, ancho, largo);
        if(!bebida.isEmpty() ){
            for(int i=0; i<bebida.size(); i++){
                bebida.get(i).paint(g);                
            }
        }
    }
    public void addBebida(Bebida b){
        if(b != null){
            bebida.add(b);
        }
    }
    public Bebida getBebida(){
        if(bebida.size() == 0)
            return null;
        else
            return bebida.remove(0);
    }
    public void setXY(int x, int y){
        this.x=x;this.y=y;        
    }
    public int getSize(){
        return bebida.size();
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getLargo(){
        return this.largo;
    }
    public int getAncho(){
        return this.ancho;
    }
}
