package expendedor2d;

import java.awt.Color;
import java.awt.Graphics;

public class Expendedor {
    private int x,  y, ancho, largo, numBebidas;
    private Deposito Coca;
    private Deposito Sprite;
    private Deposito Fanta;
    private DepositoVuelto MonVu, mon100Depos, mon1000Depos, mon500Depos, mon1500Depos;
    private int precioBebidas;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int FANTA = 3;
    
    public Expendedor(int x, int y,int numBebidas, int PrecioBebidas){
        this.x=x;this.y=y; this.numBebidas = numBebidas;
        ancho = 300; largo = 450;
        Coca = new Deposito(this.x+25,this.y+25,100,200);
        Sprite = new Deposito(Coca.getX()+150,Coca.getY(),100,200);
        MonVu = new DepositoVuelto(this.x+25,Coca.getY()+Coca.getLargo()+25,80,35);
        mon100Depos = new DepositoVuelto(MonVu.getX()+MonVu.getAncho()+5,Coca.getY()+Coca.getLargo()+25,80,35);
        mon500Depos = new DepositoVuelto(mon100Depos.getX()+mon100Depos.getAncho()+5,Coca.getY()+Coca.getLargo()+25,80,35);
        mon1000Depos = new DepositoVuelto(mon100Depos.getX(),mon100Depos.getY()+mon100Depos.getLargo()+10,80,35);
        mon1500Depos = new DepositoVuelto(mon500Depos.getX(),mon500Depos.getY()+mon500Depos.getLargo()+10,80,35);        
        precioBebidas = PrecioBebidas;
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x, y, ancho, largo);        
        if(Coca != null) Coca.paint(g);
        if(Sprite != null) Sprite.paint(g);
        if(MonVu !=null) MonVu.paint(g);
        if(mon100Depos !=null) mon100Depos.paint(g);
        if(mon500Depos !=null) mon500Depos.paint(g);
        if(mon1000Depos !=null) mon1000Depos.paint(g);
        if(mon1500Depos !=null) mon1500Depos.paint(g);     
    }
    public void setXY(int x, int y){
        this.x=x;this.y=y;
        Coca.setXY(this.x+20, this.y+20);
        Sprite.setXY(this.x+60,this.y+60);
    }
    public boolean estaEn(int x, int y){
        if(x>=this.x && x<=this.x+ancho && y>=this.y && y<=this.y+largo){
            return true;
        }else{
            return false;
        }
    }
    public void rellenarDepositos(){
        if(numBebidas > 0){
            int aux = 0;
            for(int i=0; i<3; i++){
                for(int j=0; j<numBebidas/3; j++){                    
                    Coca.addBebida(new CocaCola(100+aux, Coca.getX()+6+i*(5+26), Coca.getY()+10+j*(9+10), Color.RED));
                    Sprite.addBebida(new Sprite(200+aux, Sprite.getX()+6+i*(5+26), Sprite.getY()+10+j*(9+10), Color.GREEN));
                    aux++;
                }                
            }
        }
    }
    public void rellenarDepositosVuelto(){
        for(int i=0; i<30; i++){
            mon100Depos.addMoneda(new Moneda100(1000+i,0,0), 1);
        }
        for(int i=0; i<6; i++){
            mon500Depos.addMoneda(new Moneda500(2000+i,0,0), 1);
        } 
        for(int i=0; i<3; i++){
            mon1000Depos.addMoneda(new Moneda1000(3000+i,0,0), 1);
        }
        for(int i=0; i<2; i++){
            mon1500Depos.addMoneda(new Moneda1500(4000+i,0,0), 2);
        }        
    }
    
    public Bebida comprarBebida(Moneda moneda, int Elegida){
        Bebida bebida1= null;
        Bebida bebida2=null;
        Bebida bebida3 = null;
        if(moneda == null){
            return null;
        }
        if(moneda.getValor() >= precioBebidas){
            if(Elegida == 1){
                bebida1 = Coca.getBebida();
                if(bebida1 == null){
                    MonVu.addMoneda(moneda, 0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida1;
            }else if(Elegida == 2){
                bebida2 = Sprite.getBebida();
                if(bebida2 == null){
                    MonVu.addMoneda(moneda, 0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida2;
            }else if(Elegida == 3){
                bebida3 = Fanta.getBebida();
                if(bebida3 == null){
                    MonVu.addMoneda(moneda,0);
                }else{
                    MonVu.addMoneda(moneda, precioBebidas);
                }
                return bebida3;
            }else{
                if(moneda != null){
                    MonVu.addMoneda(moneda,0);
                    return null;
                }
            }
        }
        else{
            if(moneda == null){
                return null;
            }else{
                MonVu.addMoneda(moneda, precioBebidas);
                return null;
            }
        }
        return null;
    }
    
    public Moneda getVuelto(){
        if(MonVu.getMoneda() != null){
            return MonVu.getMoneda();
        }else{            
            return null;
        }        
    }
    public Deposito getDepos(int cual){
        switch(cual) {
            case COCA:
                return Coca;
            case SPRITE:
                return Sprite;
            default:
                return null;
        }
    }
    public DepositoVuelto getVueltoDepos(){
        return MonVu;
    }
}
