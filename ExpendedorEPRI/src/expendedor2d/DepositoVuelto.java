package expendedor2d;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DepositoVuelto {
    private int x,  y, largo, ancho;
    private ArrayList <Moneda> monto;
    
    public DepositoVuelto(int x, int y, int ancho, int largo){
        this.x=x;this.y=y;
        this.ancho = ancho; this.largo = largo;
        monto = new ArrayList <Moneda>();
    }
    public void paint(Graphics g){
        g.setColor(Color.magenta);
        g.fillRect(x, y, ancho, largo);
        for(int i=0; i<monto.size(); i++){
            if(monto.get(i) != null)
            monto.get(i).paint(g, x+i*3, y+2);
        }
    }
    
    public void addMoneda(Moneda m, int precioBebida){
        for(int i=precioBebida; i>0; i--){
            monto.add(m);                
        }
    }
    
    public Moneda getMoneda(){
        if(monto.size() == 0){
            return null;
        }else{
            return monto.remove(0);
        }
    }
    public void setXY(int x, int y){
        this.x=x;this.y=y;        
    }
    public void setXYMonedas(){
        for(int i=0; i>monto.size(); i++){
            monto.get(i).setXY(this.x+i*3, this.y+2);
        }
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
