package expendedor2d;

import java.awt.*;

abstract class Moneda {
    private int numSerie,x,y;
    public Moneda(int numSerie, int x,int y) {
    }
    public int getSerie(){
        return numSerie;
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
    public abstract int getValor();

    public abstract void paint(Graphics g, int x, int y);
        
}

class Moneda100 extends Moneda{
    private int numSerie, x,y;
    public Moneda100(int serie,int x, int y){
        super(serie,x,y);
        numSerie = serie;
    }
    @Override
    public int getValor(){
        return 100;
    }
    @Override
    public void paint(Graphics g, int x, int y){
        this.x=x; this.y=y;
        g.setColor(Color.ORANGE);
        g.fillOval(this.x,this.y,30,30);
        g.setColor(Color.WHITE);
        g.drawString(""+numSerie, this.x+30/7, this.y+15);
    }
}

class Moneda500 extends Moneda{
    
   private int numSerie, x,y;
    public Moneda500(int serie,int x, int y){
        super(serie,x,y);
        numSerie = serie;
    }
    @Override
    public int getValor(){
        return 500;
    }
    @Override
    public void paint(Graphics g, int x, int y){
        this.x=x; this.y=y;
        g.setColor(Color.BLUE);
        g.fillOval(this.x,this.y,30,30);
        g.setColor(Color.WHITE);
        g.drawString(""+numSerie, this.x+30/7, this.y+15);
    }
}

class Moneda1000 extends Moneda{
    
   private int numSerie, x,y;
    public Moneda1000(int serie,int x, int y){
        super(serie,x,y);
        numSerie = serie;
    }
    @Override
    public int getValor(){
        return 1000;
    }
    @Override
    public void paint(Graphics g, int x, int y){
        this.x=x; this.y=y;
        g.setColor(Color.BLACK);
        g.fillOval(this.x,this.y,30,30);
        g.setColor(Color.WHITE);
        g.drawString(""+numSerie, this.x+30/7, this.y+15);
    }
}
class Moneda1500 extends Moneda{
    
  private int numSerie, x,y;
    public Moneda1500(int serie,int x, int y){
        super(serie,x,y);
        numSerie = serie;
    }
    @Override
    public int getValor(){
        return 1500;
    }
    @Override
    public void paint(Graphics g, int x, int y){
        this.x=x; this.y=y;
        g.setColor(Color.green);
        g.fillOval(this.x,this.y,30,30);
        g.setColor(Color.WHITE);
        g.drawString(""+numSerie, this.x+30/7, this.y+15);
    }
}
