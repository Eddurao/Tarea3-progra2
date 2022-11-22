package expendedor2d;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;




import javax.swing.JPanel;

public class Comprador extends JPanel {
    private int vuelto;
    private String sabor;                 //La rubrica decia ocupar solo 2 variables
                  //Pero no puedo no poner la referencia a la maquina ---> se usa en sacarYcontar
    
    
    public Comprador(Moneda mo,int numbeb,Expendedor Exp) {
        vuelto = 0;
        Exp.comprarBebida(mo,numbeb);
         
        
                       //Aqui ira el delay
        
        
        
        
                                                        //QUITE EL DEPOSITO DE BEBIDAS
                                                         //QUITE EL DEPOSITO DE VUELTO
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.WHITE);
        g.drawString("Vuelto:$"+vuelto,850,120); 
        
        
        


                                           //OJO aqui agregar la imagen
    }
    
    
    public void animafinal(Graphics g){
        
        for(int i= 0; i<4 ; i++){
            
            anima(g,i);
            
        }
        
        
        
    }
    
    
    
    
    
    
    
    public void anima(Graphics g, int a){
    long time = 70; int x = 700; int y = 150; int i = 6;
    int xb = 400; int yb = 144; x -= a*13*i;
        ImageIcon d = new ImageIcon("src/img/013.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,243,330,this);
        Delay(time);  
        ImageIcon borrar = new ImageIcon("src/img/fanima.png"); 
         g.drawImage(borrar.getImage(),xb,yb,584,340,this);    x -= i;
        
//OOO que soy weon pero si llama a la misma imagen
    ImageIcon d1 = new ImageIcon("src/img/012.png");   //drawea botones
        g.drawImage(d1.getImage(),x,y,243,330,this);      
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
    ImageIcon d2 = new ImageIcon("src/img/011.png");   //drawea botones
        g.drawImage(d2.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
    ImageIcon d3 = new ImageIcon("src/img/010.png");   //drawea botones
        g.drawImage(d3.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
    ImageIcon d4 = new ImageIcon("src/img/009.png");   //drawea botones
        g.drawImage(d4.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
    ImageIcon d5 = new ImageIcon("src/img/008.png");   //drawea botones
        g.drawImage(d5.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
   ImageIcon d6 = new ImageIcon("src/img/007.png");   //drawea botones
        g.drawImage(d6.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
        ImageIcon d7 = new ImageIcon("src/img/006.png");   //drawea botones
        g.drawImage(d7.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
        ImageIcon d8 = new ImageIcon("src/img/005.png");   //drawea botones
        g.drawImage(d8.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
        ImageIcon d9 = new ImageIcon("src/img/004.png");   //drawea botones
        g.drawImage(d9.getImage(),x,y,243,330,this);
        Delay(time); 
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
        ImageIcon d10 = new ImageIcon("src/img/003.png");   //drawea botones
        g.drawImage(d10.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
        ImageIcon d11 = new ImageIcon("src/img/002.png");   //drawea botones
        g.drawImage(d11.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
        ImageIcon d12 = new ImageIcon("src/img/001.png");   //drawea botones
        g.drawImage(d12.getImage(),x,y,243,330,this);
        Delay(time);
        g.drawImage(borrar.getImage(),xb,yb,584,340,this);   x -= i;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
   
    
    public void sacarYcontar(Expendedor Exp){    //SACAR TODOS LOS MONEAS Y UNIFICARLO   
       Moneda mia = Exp.Cajamonedas.sacarMoneda();
       
       //while(mia != null){ 
        if(mia != null)vuelto += 100;
        //mia = Exp.Cajamonedas.sacarMoneda();    
    //}
    
       //vuelto = total;
       
    }
       
       
       
                                             //QUITE EL GUARDA BEBIDA
    
                                                 //QUITE GUARDA VUELTO    
    
    
    
   
    
    public String queBebiste(){
        return sabor;
    }
    
    
    
    
    
    
    
    
    public static void Delay(long millis){
        long ini = System.currentTimeMillis();
        while(System.currentTimeMillis() - ini < millis){
            
        }
        
        
    }
    
    
    
}
