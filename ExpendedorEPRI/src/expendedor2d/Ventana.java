package expendedor2d;

import javax.swing.*;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(new BorderLayout());
        this.setSize(1000,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);        
        PanelCentro pc = new PanelCentro();       
        this.add(pc,BorderLayout.CENTER);       
        this.setVisible(true);
    }
}
