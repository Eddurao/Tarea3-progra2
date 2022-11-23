package expendedor2d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Expendedor extends JPanel{
    public int numBebidas;    
    public Deposito Coca;
    public Deposito Sprite;
    public Deposito Fanta;
    public DepositoVuelto Cajamonedas;
    public int precioBebidas;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;      //Aqui se ponen las bebidas
    public Moneda monSaved;
    public Expendedor(int numBebidas, int PrecioBebidas){
                                                                    BSC= false; BSS=false; BSF=false;      
        
        Coca = new Deposito(1,numBebidas);   //Ordena todo dentro de la maquina
        Sprite = new Deposito(2,numBebidas);  //ORDENA LOS DEPOSITOS DENTRO DE LA MAQUINITA
        Fanta = new Deposito(3,numBebidas);                                     //OJO AGREGAR FANTA AQUI !!!!
        Cajamonedas = new DepositoVuelto();   //SETEA LOS DEPOSITOS
        precioBebidas = PrecioBebidas;//UNIFICAR EL COSO DE LAS MONEAS
    }
    public void paint(Graphics g){
        ImageIcon i = new ImageIcon("src/img/maquinaf.png");
        g.drawImage(i.getImage(),51,17,294,460,this);   
        
        Coca.paint(g);
        Sprite.paint(g);
        Fanta.paint(g);
        
        Cajamonedas.paint(g);
        


//63,55,270,422
        //Aqui llamamos a los pint de los objetos depositos que llaman individuales     
    }
            
    
                                             //QUITE EL SENSOR MOUSE
    public void rellenarDepositos(){
        
           
                                             //3 veces, una por cada deposito ??????? CODIGO CAMBIAR
                                         //NOSE LOGICA CAMBIAR 
                    
                    
                    
                                           //!!!!!!!!!!!!!!!!!!!Aqui agregar la Fanta
            
        
    }
                  //QUITE RELLENAR DEPOSITO VUELTO NO SE QUE HACIA
    
    public Bebida comprarBebida(Moneda moneda, int code) { //Exception poner
        monSaved = moneda; //rubrica decia que la expendedora conservara la moneda.
        try{vercantidad(code);
        }catch(NoHayBebidaException a){JOptionPane.showMessageDialog(null,a);
        Cajamonedas.Devolucion(moneda); return null;}
        try{verprecio();                   //Verificadores 
        }catch(PagoInsuficienteException aa){JOptionPane.showMessageDialog(null,aa); 
        Cajamonedas.Devolucion(moneda); return null; }
        try{vermoneda();
        }catch(PagoIncorrectoException aaa){JOptionPane.showMessageDialog(null,aaa,"ERROR",5,null); return null;
        }
        //si todo esta correcto y la moneda vale mas que el precio o igual, pasariamos acá
        int deboNmoneas = (moneda.getValor() - precioBebidas) / 100;
        for(int i=0; i<deboNmoneas;i++){Cajamonedas.BotarMoneda();}
        
        if(code == 1)return Coca.getBebida();
        if(code == 2)return Sprite.getBebida();
        if(code == 3)return Fanta.getBebida();        
        
        return Fanta.getBebida(); //Fanta de regalo si crashea (no pasara)    
    }
    
    public void vermoneda() throws PagoIncorrectoException {
        if(monSaved == null){throw new PagoIncorrectoException();}
    }
    
    public void vercantidad(int code) throws NoHayBebidaException {
        if(code == 1 && Coca.getSize() == 0){ BSC=true; throw new NoHayBebidaException(); }
        if(code == 2 && Sprite.getSize() == 0){ BSS=true; throw new NoHayBebidaException();}
        if(code == 3 && Fanta.getSize() == 0){ BSF=true; throw new NoHayBebidaException();}
    }
    
    public void verprecio() throws PagoInsuficienteException {
        if(monSaved.getValor() < precioBebidas){throw new PagoInsuficienteException();}
    }
    
    
    public Moneda getVuelto(){//SACAR MONEDAS (PONER ELIMINAR MONEDAS) CHECK!
        return Cajamonedas.sacarMoneda();
                    
            
                
    }
    
    boolean BSC;
    boolean BSS;
    boolean BSF;
    
}
