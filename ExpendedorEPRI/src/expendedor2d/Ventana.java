package expendedor2d;
//
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Locale;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
//
public class Ventana extends JFrame implements ActionListener {
    JButton BT100;      
    JButton BT500;
    JButton BT1000;
    JButton BT1500;
    JButton BTnull;
    JButton BTcoca;
    JButton BTsprite;
    JButton BTfanta;
    JButton scVuelto;
    JButton BTllena;
    String tet;
    PanelCentro pc;
    int BB;
    boolean CS;         private final JFXPanel TT = new JFXPanel(); JPanel pantalla;   
                         
    public Ventana(){
                                          // TT= new JFXPanel(); //en final poner
                                          
        
                                          
                                          
                                          
                                          
        BB = 1;     BBTLOAD();  CS=false;  BBTLOAD2(); BBTLOAD3();  //me olvide de poner el bbtload3 :c
          //NO QUIERO LAYOUT >:( que me desordene todo
        this.setSize(1000,600);
       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);        
        pc = new PanelCentro();       
        this.add(pc);   //quite el BorderLayout en segundo parametro       
        setLocationRelativeTo(null);
        this.setVisible(true);          
        
        tet = "";
        
        BT100 = new JButton();
        BT500 = new JButton();
        BT1000 = new JButton();
        BT1500 = new JButton();
        BTnull = new JButton();
        BTcoca = new JButton();
        BTsprite = new JButton();
        BTfanta = new JButton();
        scVuelto = new JButton();
        BTllena = new JButton();
        
        BT100.setBounds(540,0,115,115);
        BT500.setBounds(640,0,115,115);
        BT1000.setBounds(746,0,115,115);
        BT1500.setBounds(850,0,115,115);
        BTnull.setLayout(new BorderLayout());
        BTcoca.setBounds(266,475,239,115);
        BTsprite.setBounds(508,475,239,115);
        BTfanta.setBounds(750,475,239,115);
        scVuelto.setBounds(146,475,115,115);
        BTllena.setBounds(70,30,250,400);
        //BT100.setRolloverIcon("icono");
        
        
        add(BT100);
        add(BT500);
        add(BT1000);     //Luego hacerles setContentAreaFill(false) a cada uno
        add(BT1500);
        add(BTcoca);
        add(BTsprite);
        add(BTfanta);
        add(scVuelto);
        add(BTllena);
        add(BTnull);
        
        
        BT100.addActionListener(this);
        BT500.addActionListener(this);
        BT1000.addActionListener(this);
        BT1500.addActionListener(this);
        BTnull.addActionListener(this);
        BTcoca.addActionListener(this);
        BTsprite.addActionListener(this);
        BTfanta.addActionListener(this);
        scVuelto.addActionListener(this);
        BTllena.addActionListener(this);
        
        BT100.setContentAreaFilled(false);
        BT500.setContentAreaFilled(false);
        BT1000.setContentAreaFilled(false);
        BT1500.setContentAreaFilled(false);
        BTnull.setContentAreaFilled(false);
        BTcoca.setContentAreaFilled(false);
        BTsprite.setContentAreaFilled(false);
        BTfanta.setContentAreaFilled(false);
        scVuelto.setContentAreaFilled(false);
        BTllena.setContentAreaFilled(false);
        
        Delay(1000);
        
        
        
        
        
        
                
                
      
        
                //JFXPanel TT = new JFXPanel();
              /*  
                pantalla = new JPanel();
                pantalla.setBounds(200,200,500,500);
                add(pantalla); //!!! DEF EN CLASS private final JFXPanel TT = new JFXPanel(); JPanel pantalla;
                pantalla.setVisible(true);
                File file = new File("C:\\Users\\eparr\\Desktop\\fantav2.mp4");
                MediaPlayer oracleVid = new MediaPlayer(
                new Media( file.toURI().toString() )    );
                
                MediaView ptll = new MediaView(oracleVid);
                ptll.setMediaPlayer(oracleVid);//oracleVid.setCycleCount (MediaPlayer.INDEFINITE); //Repetir el video
                TT.setScene(new Scene(new Group(ptll ) )      );
                pantalla.add(TT);//oracleVid.setVolume(0.7);
                pc.add(pantalla);//pc le da mas claridad y no sobre ridea pc.add(pantalla);   //funciono pc.
                oracleVid.play();
       */

       
       
       
       
       
       
       
                
                
                                           //!!! DEF EN CLASS private final JFXPanel TT = new JFXPanel(); JPanel pantalla;
               
       
       
       
       
    }
    
    public  void actionPerformed(ActionEvent e){
        
      
        if(e.getSource() == BT100){        //block button
            System.out.println("100 Seleccionado               funcionafeliz"); 
            pc.MainCoin = new Moneda100(0,0); BB = 0; pc.BB = 0; repaint();
        }
        
         if(e.getSource() == BT500){
            System.out.println("500 Seleccionado                bacan");
            pc.MainCoin = new Moneda500(0,0); BB = 0; pc.BB = 0; repaint();
        }
        
         if(e.getSource() == BT1000){
            System.out.println("1000 Seleccionado                putin");
            pc.MainCoin = new Moneda1000(0,0); BB = 0; pc.BB = 0; repaint();
        }
    
         if(e.getSource() == BT1500){
            System.out.println("1500 Seleccionado                obama");   
            pc.MainCoin = new Moneda1500(0,0); BB = 0; pc.BB = 0; repaint();
        }  
         
         if(e.getSource() == BTnull){
             System.out.println("fuera de lugar"); 
        }
        
         if(BB == 0){   //Button Block
         if(e.getSource() == BTcoca){
             System.out.println("coca"); 
             pc.SodaCode = 1; pc.invitarComprador(); repaint(); CLINT3(); pc.com.animafinal(this.getGraphics()); CLINT(); createSceneCO();
        }
         
         if(e.getSource() == BTsprite){
             System.out.println("sprite");
             pc.SodaCode = 2; pc.invitarComprador();  repaint(); CLINT3(); pc.com.animafinal(this.getGraphics()); CLINT();
             createSceneS();
        }
         
         if(e.getSource() == BTfanta){
             System.out.println("fanta");
             pc.SodaCode = 3; pc.invitarComprador(); repaint() ; CLINT3(); pc.com.animafinal(this.getGraphics());
                      CLINT();  createScene();
// createScene(); ;;;;;; 
        }
         
         }
         
         if(e.getSource() == scVuelto && !pc.exp.Cajamonedas.noqueda()){
             System.out.println("scVUELTO"); CLINT2();
             pc.com.sacarYcontar(pc.exp); repaint();
             
             
             
         }
         
         if(e.getSource() == BTllena){
             System.out.println("RELLENANDO EXPENDEDORA CON LAS SIGUIENTES BEBIDAS:");
             pc.exp.Coca.rellenar();
             pc.exp.Fanta.rellenar();
             pc.exp.Sprite.rellenar();
             System.out.println("EXPENDEDORA HA SIDO RELLENADA CON EXITO!");
         }
             
             
             
            
         
             
             
             
             
        
         
         
         
         
         
    }
    
    
 


 
 
 
//<editor-fold>
int CSC = 0;
    public void createScene(){    //crear las escenas sprite y cocacola
        //Platform.runLater(new Runnable(){
          //   @Override  
            //public void run(){
         
            // ERROR: ESTO NO SE PUEDE USAR 2 VECES. NOSE PORQUE PASA PERO CREO QUE ES PORQUE UN METODO DENTRO DE ESTA
            //---FUNCION SOLAMENTE SE PUEDE LLAMAR 1 SOLA VEZ. ASIQUE BLOQUEARE ESTO A 1 SOLA VEZ. ME RINDO :( (6 horas gastadas)
              if(CSC == 0){  
                pantalla = new JPanel();
                pantalla.setBounds(200,200,500,500);
                
                                           //!!! DEF EN CLASS private final JFXPanel TT = new JFXPanel(); JPanel pantalla;
                pantalla.setVisible(true);
                
                File file = new File("src/img/fantav2.mp4");
                MediaPlayer oracleVid = new MediaPlayer(new Media( file.toURI().toString() )    );
                MediaView ptll = new MediaView(oracleVid);
                ptll.setMediaPlayer(oracleVid);//oracleVid.setCycleCount (MediaPlayer.INDEFINITE); //Repetir el video
                TT.setScene(new Scene(new Group(ptll ) )      );  
              
                
               pantalla.add(TT);//oracleVid.setVolume(0.7);
               pc.add(pantalla); //<< AQUI ESTÁ EL ´PROBLEMA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                //SI SE BORRA SUENA PERO NO SE MUESTRA
                           // sospecho que este no se puede llamar a cada rato //pc le da mas claridad y no sobre ridea pc.add(pantalla);   //funciono pc.
                 
                
                //era pc.add(pantalla);
                oracleVid.play(); 
              }   
               CSC ++; 
                //que hice
         //  }   
       // }         //Ver que Elimine sus punteros luego
       // );
    }
    
    
    
    
    
    //SPRITE VIDEO
    
   
    public void createSceneS(){    //crear las escenas sprite y cocacola
        //Platform.runLater(new Runnable(){
          //   @Override  
            //public void run(){
         
            // ERROR: ESTO NO SE PUEDE USAR 2 VECES. NOSE PORQUE PASA PERO CREO QUE ES PORQUE UN METODO DENTRO DE ESTA
            //---FUNCION SOLAMENTE SE PUEDE LLAMAR 1 SOLA VEZ. ASIQUE BLOQUEARE ESTO A 1 SOLA VEZ. ME RINDO :( (6 horas gastadas)
              if(CSC == 0){   //TT.setScene(null);
                pantalla = new JPanel();
                pantalla.setBounds(200,200,500,500);
                
                                           //!!! DEF EN CLASS private final JFXPanel TT = new JFXPanel(); JPanel pantalla;
                pantalla.setVisible(true);
                
                File file = new File("src/img/spritev2.mp4");
                MediaPlayer oracleVid = new MediaPlayer(new Media( file.toURI().toString() )    );
                MediaView ptll = new MediaView(oracleVid);
                ptll.setMediaPlayer(oracleVid);//oracleVid.setCycleCount (MediaPlayer.INDEFINITE); //Repetir el video
                TT.setScene(new Scene(new Group(ptll ) )      );  
              
                
               pantalla.add(TT);//oracleVid.setVolume(0.7);
               add(pantalla); //<< AQUI ESTÁ EL ´PROBLEMA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                //SI SE BORRA SUENA PERO NO SE MUESTRA
                           // sospecho que este no se puede llamar a cada rato //pc le da mas claridad y no sobre ridea pc.add(pantalla);   //funciono pc.
                 
                
                //era pc.add(pantalla);
                oracleVid.play();
              }   
               CSC ++; 
                //que hice
         //  }   
       // }         //Ver que Elimine sus punteros luego
       // );
    }
    
    
    
    
    
    //coca
    
    
    public void createSceneCO(){    //crear las escenas sprite y cocacola
        //Platform.runLater(new Runnable(){
          //   @Override  
            //public void run(){
         
            // ERROR: ESTO NO SE PUEDE USAR 2 VECES. NOSE PORQUE PASA PERO CREO QUE ES PORQUE UN METODO DENTRO DE ESTA
            //---FUNCION SOLAMENTE SE PUEDE LLAMAR 1 SOLA VEZ. ASIQUE BLOQUEARE ESTO A 1 SOLA VEZ. ME RINDO :( (6 horas gastadas)
              if(CSC == 0){   
                pantalla = new JPanel();
                pantalla.setBounds(200,200,500,500);
                
                                           //!!! DEF EN CLASS private final JFXPanel TT = new JFXPanel(); JPanel pantalla;
                pantalla.setVisible(true);
                
                File file = new File("src/img/cocav.mp4");
                MediaPlayer oracleVid = new MediaPlayer(new Media( file.toURI().toString() )    );
                MediaView ptll = new MediaView(oracleVid);
                ptll.setMediaPlayer(oracleVid);//oracleVid.setCycleCount (MediaPlayer.INDEFINITE); //Repetir el video
                TT.setScene(new Scene(new Group(ptll ) )      );  
              
                
               pantalla.add(TT);//oracleVid.setVolume(0.7);
               pc.add(pantalla); //<< AQUI ESTÁ EL ´PROBLEMA !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                //SI SE BORRA SUENA PERO NO SE MUESTRA
                           // sospecho que este no se puede llamar a cada rato //pc le da mas claridad y no sobre ridea pc.add(pantalla);   //funciono pc.
                 
                
                //era pc.add(pantalla);
                oracleVid.play();
              }   
               CSC ++; 
                //que hice
         //  }   
       // }         //Ver que Elimine sus punteros luego
       // );
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //</editor-fold>
    

String pon;
    Media son;
    MediaPlayer check;
    private void BBTLOAD(){
    
    JFXPanel bac = new JFXPanel();
      
        pon = new File("src/img/compraf.wav").toURI().toString();
        son = new Media(pon);
        
                
        check = new MediaPlayer( son );
    
    
    }
    
    private void CLINT(){
        try{check.play();}
        catch(Exception er){}
        
        check = new MediaPlayer(son);
        
        
    }
    
    
    
    
    
    String pon2;
    Media son2;
    MediaPlayer check2;
    private void BBTLOAD2(){
    
    JFXPanel bac = new JFXPanel();
      
        pon2 = new File("src/img/dropcoin2.wav").toURI().toString();
        son2 = new Media(pon2);
        
                
        check2 = new MediaPlayer( son2 );
    
    
    }

    private void CLINT2(){
        try{check2.play();}
        catch(Exception er){}
        
        check2 = new MediaPlayer(son2);
        
        
    }

    
    String pon3;
    Media son3;
    MediaPlayer check3;
    private void BBTLOAD3(){
    
    JFXPanel bac = new JFXPanel();
      
        pon3 = new File("src/img/ChadWalking.wav").toURI().toString();   //se me olvido ponerle el audio :c
        son3 = new Media(pon3);
        
                
        check3 = new MediaPlayer( son3 );
    
    
    }
    
    private void CLINT3(){
        try{check3.play();}
        catch(Exception er){}
        
        check3 = new MediaPlayer(son3);
        
        
    }
    
    

public static void Delay(long millis){
        long ini = System.currentTimeMillis();
        while(System.currentTimeMillis() - ini < millis){
            
        }
        
        
    }

   







 public void anima50(Graphics g){
    long time = 300; int x = 500; int y = 250;
        ImageIcon d = new ImageIcon("src/img/013.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);     repaint(); Delay(time); g.clearRect(x,y,115,115); repaint();
         d = new ImageIcon("src/img/011.png"); repaint();  //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this); repaint(); Delay(time);
 }



public void anima1(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/013.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima2(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/012.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}

public void anima3(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/011.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}

public void anima4(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/010.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima5(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/009.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima6(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/008.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima7(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/007.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima8(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/006.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima9(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/005.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima10(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/004.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima11(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/003.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima12(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/002.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
public void anima13(Graphics g,long time,int x, int y){
        ImageIcon d = new ImageIcon("src/img/001.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);    
}
 
 
 
 
 
 public void animacion(Graphics g){
   
 long time = 60;   int x = 500; int y = 250;
 
 anima1(g,time,x,y);   
 anima2(g,time,x,y);   
 anima3(g,time,x,y);   
 anima4(g,time,x,y);   
 anima5(g,time,x,y);   
 anima6(g,time,x,y);   
 anima7(g,time,x,y);   
 anima8(g,time,x,y);  
 anima9(g,time,x,y);   
 anima10(g,time,x,y); 
 anima11(g,time,x,y); 
 anima12(g,time,x,y); 
 anima13(g,time,x,y); 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
 
 
 
 
 
 





















































 public void anima(Graphics g){
    long time = 100; int x = 500; int y = 250;
        ImageIcon d = new ImageIcon("src/img/013.png");   //drawea botones
        g.drawImage(d.getImage(),x,y,115,115,this);
        Delay(time);     repaint();                                   //OOO que soy weon pero si llama a la misma imagen
    ImageIcon d1 = new ImageIcon("src/img/012.png");   //drawea botones
        g.drawImage(d1.getImage(),x,y,115,115,this);
        Delay(time);        repaint();
    ImageIcon d2 = new ImageIcon("src/img/011.png");   //drawea botones
        g.drawImage(d2.getImage(),x,y,115,115,this);
        Delay(time);       repaint();
    ImageIcon d3 = new ImageIcon("src/img/010.png");   //drawea botones
        g.drawImage(d3.getImage(),x,y,115,115,this);
        Delay(time);        repaint();
    ImageIcon d4 = new ImageIcon("src/img/009.png");   //drawea botones
        g.drawImage(d4.getImage(),x,y,115,115,this);
        Delay(time);        repaint(); 
    ImageIcon d5 = new ImageIcon("src/img/008.png");   //drawea botones
        g.drawImage(d5.getImage(),x,y,115,115,this);
        Delay(time);        repaint(); 
   ImageIcon d6 = new ImageIcon("src/img/007.png");   //drawea botones
        g.drawImage(d6.getImage(),x,y,115,115,this);
        Delay(time);       repaint();
        ImageIcon d7 = new ImageIcon("src/img/006.png");   //drawea botones
        g.drawImage(d7.getImage(),x,y,115,115,this);
        Delay(time);        repaint();
        ImageIcon d8 = new ImageIcon("src/img/005.png");   //drawea botones
        g.drawImage(d8.getImage(),x,y,115,115,this);
        Delay(time);       repaint();
        ImageIcon d9 = new ImageIcon("src/img/004.png");   //drawea botones
        g.drawImage(d9.getImage(),x,y,115,115,this);
        Delay(time);        repaint();
        ImageIcon d10 = new ImageIcon("src/img/003.png");   //drawea botones
        g.drawImage(d10.getImage(),x,y,115,115,this);
        Delay(time);        repaint();
        ImageIcon d11 = new ImageIcon("src/img/002.png");   //drawea botones
        g.drawImage(d11.getImage(),x,y,115,115,this);
        Delay(time);        repaint();
        ImageIcon d12 = new ImageIcon("src/img/001.png");   //drawea botones
        g.drawImage(d12.getImage(),x,y,115,115,this);
        Delay(time);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
   










}
