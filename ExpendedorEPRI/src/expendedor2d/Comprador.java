package expendedor2d;

import java.awt.*;

public class Comprador {
    private int vuelto, cualBeb, ordenDepos=0, ordenDeposMon=0, aux=-1;
    private String tomar;
    private int x,  y, altura, ancho;
    private Color color;
    private Bebida lata;
    private Deposito bebidaDepos;
    private DepositoVuelto vueltoDepos;
    
    public Comprador(int x, int y, Color color) {
        this.x=x;this.y=y;
        altura = 400; ancho = 150; 
        this.color = color;
        bebidaDepos = new Deposito(x-30, y+200,30,100);
        vueltoDepos = new DepositoVuelto(x+ancho-75, y+200, 75, 35);
    }
    public void paint(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, ancho, altura);
        if(bebidaDepos != null) bebidaDepos.paint(g);
        if(vueltoDepos != null) vueltoDepos.paint(g);
        g.setColor(Color.LIGHT_GRAY);        
        g.fillRect(375, 300, 50, 35);        
        g.setColor(Color.ORANGE);
        g.drawString(""+100, 750, 70);
        g.drawRect(750, 50, 30, 30);
        g.setColor(Color.BLUE);
        g.drawRect(790, 50, 30, 30);
        g.drawString(""+500, 790, 70);
        g.setColor(Color.BLACK);
        g.drawRect(830, 50, 30, 30);
        g.drawString(""+1000, 830, 70);
        g.setColor(Color.green);
        g.drawString(""+1500, 870, 70);
        g.drawRect(870, 50, 30, 30);
        g.setColor(Color.MAGENTA);
        g.drawString("VUELTO", 376, 320);
    }
    public boolean estaEn(int x, int y){
        boolean r = false;
        if(x>=this.x && x<=x+50 && y>=this.y && y<=this.y+50){
            r=true;
        }
        return r;
    }
    public void cualBebida(int cual){        
        cualBeb = cual;
    }
    public int eleccion(){
        return cualBeb; 
    }
    public Moneda cualMoneda(Expendedor exp, int X, int Y){
        Moneda aux;
        this.aux++;
        if(X>=750 && X<=780 && Y>=50 && Y<=780){
            aux = new Moneda100(12345+this.aux,0,0);
            return aux;
        }else if(X>=790 && X<=820 && Y>=50 && Y<=780){
            aux = new Moneda500(13346+this.aux,0,0);
            return aux;
        }else if(X>=830 && X<=860 && Y>=50 && Y<=780){
            aux = new Moneda1000(14347+this.aux,0,0);
            return aux;
        }else if(X>=870 && X<=900 && Y>=50 && Y<=780){
            aux = new Moneda1500(15348+this.aux,0,0);
            return aux;
        }else{
            return null;
        }       
    }
    public void hayBebida(Moneda m, int cualBebida, Expendedor exp){
        lata = exp.comprarBebida(m, cualBebida);
        if(lata != null){
            tomar = lata.beber();
        }else{                            
            tomar = null;
        }
    }
    public void calculaVuelto(Moneda m, Expendedor exp){
        vuelto = 0;
        for(int i = 0; true; i++){
            Moneda monAux = exp.getVuelto();
            if(monAux != null){
                vuelto = vuelto + monAux.getValor();
            }else{
                break;
            }            
        }
        if(lata == null){
            if(m != null){
                vuelto = m.getValor();
            }
        }
    }
    public void guardarBebida(Bebida lata){
        if(lata != null){
            lata.setXY(bebidaDepos.getX()+2, bebidaDepos.getY()+ordenDepos*lata.getLargo());
            bebidaDepos.addBebida(lata);
            ordenDepos++;
        }                                     
    }
    public void guardarVuelto(Moneda mon){
        if(mon != null){
            mon.setXY(vueltoDepos.getX()+ordenDeposMon*3, vueltoDepos.getY()+2);  
            vueltoDepos.addMoneda(mon, mon.getValor());
            ordenDeposMon++;
        }
    }
    public void tomarVuelto(Expendedor exp){
        if(exp.getVuelto() != null){           
            vueltoDepos.addMoneda(exp.getVuelto(), 1);
        }
    }
    
    public int cuantoVuelto(){
        return vuelto;
    }
    
    public String queBebiste(){
        return tomar;
    }
}
