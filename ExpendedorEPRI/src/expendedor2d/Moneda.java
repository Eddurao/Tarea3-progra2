package expendedor2d;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

abstract class Moneda extends JPanel {        //Me parece que no tiene que ser tan abstracto ??  aaaa nooooo si puede
    public int numSerie,x,y;       // QUE ES EL NUMSERIE !!!! NO LE DA VALOR A NUMSERIE
    public Moneda( int x,int y) {
    this.x = x; this.y = y;
    
    }                                //ES ABSTARCTO.. PERO AQUI DEFINIR EL PUNTERO VALOR A DECIMAL
    public int getSerie(){          //TQV con el CODIGO HASH ????
        return numSerie;
    }                           /////JAJAJAJ ESTUVE PEGADO AQUI Y ERA PORQUE NO PUSE EL CONSTRUCTOR 
    public void setSerie(){
                                     //Esto que hice yo te crea la serie/Ponelo arriba en el constructor
       
    
    }
    public void setXY(int x, int y){     //QUITE NUMSERIE DE PARAMETRO PORQUE LO PUEDE CONSTRUIR SOLITO
        this.x = x; this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public abstract int getValor();
    
   

    //public abstract void paint(Graphics g);
    
    public abstract void paint(Graphics g); 
                            //QUITE EL X E Y PQ YA LO TENENMOS
                           //AQUi poner imagen de cada moneda
        
    
    
        
}

class Moneda100 extends Moneda{
                      //AQUI REPITE LAS PROPIEDADES DE LA MONEDA !!!!
    public Moneda100(int x, int y){
        super(x,y);
        //super.numSerie = .....   COMPLETAER ESTA OBTENER EL HASH CODE ???
    }
    @Override
    public int getValor(){
        return 100;
    }
        //NO NECESITO COLOCAR PAINT PQ LO HEREDA DE ARRIBA
    @Override
    
    public void paint(Graphics g){
        
        
         ImageIcon mon100 = new ImageIcon("src/img/100pesos.png");  
        g.drawImage(mon100.getImage(),super.x ,super.y ,40,40,this); 
        
        
    }
    
    
}

class Moneda500 extends Moneda{
    
   
    public Moneda500(int x, int y){
        super(x,y);
        super.setSerie();
    }
    @Override
    public int getValor(){
        return 500;
    }
    @Override
    public void paint(Graphics g){            //QUITE TODOS LOS X E Y ERAN REDUNDANTES
        
        
         ImageIcon mon500 = new ImageIcon("src/img/500pesosvolteada.png");  
        g.drawImage(mon500.getImage(),super.x ,super.y ,100,100,this); 
    }
}

class Moneda1000 extends Moneda{
    
   
    public Moneda1000(int x, int y){
        super(x,y);
        super.setSerie();
    }
    @Override
    public int getValor(){
        return 1000;
    }
    @Override
    public void paint(Graphics g){
        
        
         ImageIcon mon1000 = new ImageIcon("src/img/moneda1000.png");  
        g.drawImage(mon1000.getImage(),super.x ,super.y ,100,100,this); 
    }
}
class Moneda1500 extends Moneda{
    
  
    public Moneda1500(int x, int y){
        super(x,y);
        super.setSerie();
    }
    @Override
    public int getValor(){
        return 1500;
    }                                        //UNIFICAR EL GRAPHICS G
    @Override
    public void paint(Graphics g){
        
        
         ImageIcon mon1500 = new ImageIcon("src/img/alienf.png");  
        g.drawImage(mon1500.getImage(),super.x ,super.y ,100,100,this); 
    }
}
