import java.awt.Dimension;
import javax.swing.JFrame;

public class Main{

    public static void main(String[] args) {
        
        /*
        Transmisor transmisor = new Transmisor();
        PanelT panelT = new PanelT();
        Ventana ventanaT = new Ventana("Transmisor",panelT);
        transmisor.setPanel(panelT);
        panelT.setTransmisor(transmisor);
        */
        
    	
        Receptor receptor = new Receptor();
        PanelR panelR = new PanelR("B");
        Ventana ventanaR = new Ventana("Receptor",panelR);
        receptor.setPanel(panelR);
        panelR.setReceptor(receptor);
        
        
        
    }
}
