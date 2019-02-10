import java.awt.Dimension;

import javax.swing.JFrame;

public class Main{

    public static void main(String[] args) {
        
        Transmisor transmisor = new Transmisor();
        Receptor receptor = new Receptor();
        PanelT panelT = new PanelT();
        PanelR panelR = new PanelR();
        
        Ventana ventanaT = new Ventana("Transmisor",panelT);
        Ventana ventanaR = new Ventana("Receptor",panelR);
        
        transmisor.setPanel(panelT);
        receptor.setPanel(panelR);
        
    }
}
