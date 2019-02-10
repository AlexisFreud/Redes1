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
        /*
            //Main m = new Main();
            char[] Array = {'a', 'b', 'c', 'd', 'e',
                             'f', '0', '1', '2', '3',
                             '4', '5', '6', '7', '8', 
                             '9'};
            for(char c: Array) {
                    int[] juan = Traductor.traducir(c);
                    for(int i: juan) {
                            System.out.print(i + " ");
                    }
                    System.out.print(Traductor.traducir(juan));
                    Timer.esperar(true);
                    System.out.println();
            }
    }

    public Main(){
        /*
            super("Redes");
            this.setPreferredSize(new Dimension(1280, 720));
            //this.add(new PanelR());
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.pack();
            this.setVisible(true);

    }*/
}
