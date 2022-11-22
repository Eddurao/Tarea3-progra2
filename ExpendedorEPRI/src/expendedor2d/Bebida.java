package expendedor2d;



import java.awt.*;     //Falta La imagen(paint) y el sonido
import javax.swing.ImageIcon;
import javax.swing.JPanel;

abstract public class Bebida extends JPanel {
    public int numSerie;
    public int x, y;
    
    
    public Bebida(int x, int y){
        this.x = x; this.y = y;
        this.numSerie = 1;    
    }
    public int getSerie(){
        return this.numSerie;
    }
    public abstract String beber();

    public abstract void paint(Graphics g);   //OJO aqui pondremos la imagen
        
        
        
    
    public void setXY(int x, int y){        
        this.x = x; this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    
    
}

class Sprite extends Bebida{
    
    public Sprite(int x, int y){
        super(x, y);
    }
    @Override
    public String beber(){
        return "Sprite";            //Customizar
    }
    @Override
    public void paint(Graphics g){
        
        ImageIcon i2 = new ImageIcon("src/img/spritef.png");   //drawea botones
        g.drawImage(i2.getImage(),super.x + (-7*super.y/55+26),super.y,50 + 7*super.y/55 - 26,100 + 14*super.y/55 - 26*2,this);      //g.drawImage(i2.
        //Esto es para que las bebidas de mas arriba sean mas chicas emulando el espacio
    }
}

class CocaCola extends Bebida{
    
    public CocaCola(int x, int y){
        super(x, y);
    }
    @Override
    public String beber(){
        return "CocaCola";
    }
    @Override
    public void paint(Graphics g){
        
        ImageIcon i2 = new ImageIcon("src/img/colaf.png");   //drawea botones
        g.drawImage(i2.getImage(),super.x + (-7*super.y/55+26),super.y,50 + 7*super.y/55 - 26,100 + 14*super.y/55 - 26*2,this);      //g.drawImage(i2.
        
    }
}
class Fanta extends Bebida{
    
    public Fanta(int x, int y){
        super(x, y);
    }
    @Override
    public String beber(){
        return "Fanta";
    }
    @Override
    public void paint(Graphics g){
        
        ImageIcon i2 = new ImageIcon("src/img/fantaf.png");   //drawea botones
        g.drawImage(i2.getImage(),super.x + (-7*super.y/55+26),super.y,50 + 7*super.y/55 - 26,100 + 14*super.y/55 - 26*2,this);      //g.drawImage(i2.
        
    }
}
