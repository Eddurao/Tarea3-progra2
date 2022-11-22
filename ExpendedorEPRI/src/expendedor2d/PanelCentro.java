package expendedor2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.swing.*;

public class PanelCentro extends JPanel {
    public Expendedor exp;
    public Comprador com;
    public int t;
    JButton boton1;
    public int SodaCode;
    public Moneda MainCoin;
    public int BB;
    
    
    
    
    
                   // VAMOS A QUITAR EL CLICK LISTENER Y PONEMOS UN ACTION LISTENER 
    public PanelCentro(){
        BB = 1;
        int capacidad=-1;                   BBTLOAD();
        int precio=2;
        while((capacidad<0)){
        capacidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de bebidas que tendrá la maquina"));
        }
         ImageIcon heinserberg = new ImageIcon("C:\\Users\\eparr\\3D Objects\\precio.png");
         
         
         mediaPlayer.play();
         
       String Aa = (String) JOptionPane.showInputDialog(null, "precio ?", "precio ?",JOptionPane.INFORMATION_MESSAGE, heinserberg, null, null);
       precio = Integer.parseInt(Aa); 
//precio = Integer.parseInt(JOptionPane.showInputDialog(null,null,heinserberg));
        exp = new Expendedor(capacidad,precio);    //Aqui se crea el expendedor x y num precio //!!!!SETEAR PRECIOS
         // com = new Comprador(600,100);
        
       //JOptionPane.showInputDialog(null, "precio ?", "precio ?", 3, heinserberg, null, null);
        
        System.out.println(precio);
                                               //QUITAMOS LOS RADIOBOTONES Y EL BOTON GROUP
    }
    
    public void invitarComprador(){
        
        com = new Comprador(MainCoin,SodaCode,exp);
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        ImageIcon i = new ImageIcon("src/img/fondof.png");   //drawea fondo
        g.drawImage(i.getImage(),0,0,1000,600,this);
        
        ImageIcon i2 = new ImageIcon("src/img/alienf.png");   //drawea botones
        g.drawImage(i2.getImage(),850,0,115,115,this);      //g.drawImage(i2.getImage(),0,0,1000,600,this); easter egg
        ImageIcon i3 = new ImageIcon("src/img/moneda1000.png");   //drawea botones
        g.drawImage(i3.getImage(),746,0,115,115,this);
        ImageIcon i4 = new ImageIcon("src/img/500pesosvolteada.png");   //drawea botones
        g.drawImage(i4.getImage(),640,0,115,115,this);
        ImageIcon i5 = new ImageIcon("src/img/100pesos.png");   //drawea botones
        g.drawImage(i5.getImage(),540,0,115,115,this);
        
        ImageIcon b = new ImageIcon("src/img/ff.png");   //drawea botones
        g.drawImage(b.getImage(),750,475,239,115,this);
        ImageIcon b2 = new ImageIcon("src/img/sf.png");   //drawea botones
        g.drawImage(b2.getImage(),508,475,239,115,this);
        ImageIcon b3 = new ImageIcon("src/img/cf.png");   //drawea botones
        g.drawImage(b3.getImage(),266,475,239,115,this);
        
        
        ImageIcon vsi = new ImageIcon("src/img/vf.png");   //drawea botones
        g.drawImage(vsi.getImage(),146,465,115,115,this);
        
        if(BB == 1){ImageIcon b4 = new ImageIcon("src/img/BBBM.png");   //drawea Blockeo botones de abajo
        g.drawImage(b4.getImage(),266,475,734,115,this);
        }
        if(exp.Cajamonedas.noqueda()){
            ImageIcon vno = new ImageIcon("src/img/nvf.png");   //drawea botones
        g.drawImage(vno.getImage(),146,465,115,115,this);
        }
        
        
        
        if(exp !=null ) exp.paint(g);
        if(t==0){
        //ImageIcon aiep = new ImageIcon("C:\\Users\\eparr\\3D Objects\\dclive.png");   
        //g.drawImage(aiep.getImage(),700,117,265,360,this);                              //Pinta el com INICIAL.
        }
        
       
        
        
        
        if(com!=null)com.paint(g);          //aqui llamamos a los paints de las cosas
    }   
    
    
   
    
    
    
    
    
  /*  public void video(Graphics g){
        Delay(1000);
            ImageIcon b = new ImageIcon("C:\\Users\\eparr\\Music\\data\\001.png");   //drawea botones
        g.drawImage(b.getImage(),300,300,239*2,115*2,this);
           
            
            
        
        
        
    } */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    String pon;
    Media son;
    MediaPlayer mediaPlayer;
    private void BBTLOAD(){
    
    JFXPanel bac = new JFXPanel();
      
        pon = new File("C:\\Users\\eparr\\Desktop\\BBTERLQ.wav").toURI().toString();
        son = new Media(pon);
        
                
        mediaPlayer = new MediaPlayer( son );
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Delay(long millis){
        long ini = System.currentTimeMillis();
        while(System.currentTimeMillis() - ini < millis){
            
        }
        
        
    }
    
    
    
    
}


