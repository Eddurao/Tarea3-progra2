package expendedor2d;

import java.awt.*;

abstract public class Bebida {
    private int numSerie;
    private int x, y, ancho, largo;
      //Hice cambios
    
    public Bebida(int numSerie, int x, int y, Color color){
        this.x = x; this.y = y;
        this.numSerie = numSerie;
    
        this.ancho = 26; this.largo = 10;
    }
    public int getSerie(){
        return this.numSerie;
    }
    public abstract String beber();

    public void paint(Graphics g) {
     
        g.drawRect(x, y, ancho, largo);
        g.drawString(""+numSerie, x+ancho/7, y+largo);
    }
    public void setXY(int x, int y){        
        this.x = x; this.y = y;
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

class Sprite extends Bebida{
    
    public Sprite(int numSerie, int x, int y, Color color){
        super(numSerie, x, y, color);
    }
    @Override
    public String beber(){
        return "Sprite";
    }
}

class CocaCola extends Bebida{
    
    public CocaCola(int numSerie, int x, int y, Color color){
        super(numSerie, x, y, color);
    }
    @Override
    public String beber(){
        return "CocaCola";
    }
}
class Fanta extends Bebida{
    
    public Fanta(int numSerie, int x, int y, Color color){
        super(numSerie, x, y, color);
    }
    @Override
    public String beber(){
        return "Fanta";
    }
}
