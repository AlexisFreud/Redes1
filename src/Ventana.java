import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    public Ventana(JPanel panel){
        super("Receptor");
        this.setPreferredSize(new Dimension(1280, 720));
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    
    
}
