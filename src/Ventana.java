import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana(String nombre, JPanel panel){
        super(nombre);
        this.setPreferredSize(new Dimension(1280, 720));
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
    
}
