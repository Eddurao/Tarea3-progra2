package expendedor2d;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class PanelCentro extends JPanel{
    private Expendedor exp;
    private Comprador com;
    private ClickListener cl;
    public PanelCentro(){
        this.setBackground(Color.white);
        exp = new Expendedor(75,50,30,500);
        com = new Comprador(600,100,Color.orange);
        cl = new ClickListener();
        this.addMouseListener(cl);
        radioButton rB1 = new radioButton("CocaCola", exp.COCA, com);
        radioButton rB2 = new radioButton("Sprite", exp.SPRITE, com);
        this.add(rB1);
        this.add(rB2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rB1);
        bg.add(rB2);
    }   
    public void paint(Graphics g){
        super.paint(g);
        if(exp !=null ) exp.paint(g);
        if(com!=null)com.paint(g);
    }   
    public class ClickListener implements MouseListener{
        public void mouseClicked(MouseEvent e) { ;
        }
        public void mousePressed(MouseEvent arg0) {            
            if(com!=null){
                if(com.estaEn(arg0.getX(),arg0.getY()))
                    System.out.println("esta en");
            }
            if(exp!=null){
                if(exp.estaEn(arg0.getX(),arg0.getY())){            
                    exp.rellenarDepositos();
                    exp.rellenarDepositosVuelto();
                }
                if(com.cualMoneda(exp, arg0.getX(), arg0.getY()) != null){
                    Bebida lata = exp.comprarBebida(com.cualMoneda(exp, arg0.getX(), arg0.getY()), com.eleccion());
                    com.guardarBebida(lata);                    
                }
            }                                      
            if(exp.getVuelto() != null){
                exp.getVueltoDepos().setXYMonedas();
                if(arg0.getX()>=375 && arg0.getX()<=425 && arg0.getY()>=300 && arg0.getY()<=335){
                    com.tomarVuelto(exp);
                }
            }
            repaint();
        }
        public void mouseReleased(MouseEvent e) { ;
        }
        public void mouseEntered(MouseEvent e) { ;
        }
        public void mouseExited(MouseEvent e) { ;
        }
    }
    private class radioButton extends JRadioButton implements ActionListener{
        Comprador com;
        int cual;
        public radioButton(String beb, int cual, Comprador com){
            super(beb);
            this.cual = cual;
            this.com = com;
            this.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e) {
            com.cualBebida(cual);
        }   
    }
}

