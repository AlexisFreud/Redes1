import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelR extends JPanel {
        //private JFrame frame;
	private Receptor receptor;
	private JLabel lbTitulo,
				   lbCola,
				   lbCaracteresRecibidos,
				   lbLeyendas;
        private String recep,
                        instrumento;
	
	public PanelR() {
            super();
            this.setPreferredSize(new Dimension(1280, 720));
            this.recep = "A";
            //this.setLayout(new BorderLayout());
           
            JPanel main = new JPanel();
            main.setPreferredSize(new Dimension(1250, 703));
            this.setLayout(new BorderLayout());
             
            this.lbTitulo = new JLabel("Receptor "+ recep + " ("+instrumento+")");
            this.lbTitulo.setFont(lbTitulo.getFont().deriveFont(50.0f));
            this.lbTitulo.setBorder(new LineBorder(Color.BLACK));
            this.add(lbTitulo,BorderLayout.NORTH);
            
            this.lbCola = new JLabel("<html>IZQ<br/>DER<br/>FIN</html>");
            this.lbCola.setFont(lbTitulo.getFont().deriveFont(45.0f));
            this.lbCola.setBorder(new LineBorder(Color.BLACK));
            this.add(lbCola,BorderLayout.EAST);
            
            this.lbCaracteresRecibidos = new JLabel("Caracteres recibidos:"+"\n"+"laaal");
            this.lbCaracteresRecibidos.setFont(lbCaracteresRecibidos.getFont().deriveFont(30.0f));
            this.lbCaracteresRecibidos.setBorder(new LineBorder(Color.BLACK));
            this.add(lbCaracteresRecibidos,BorderLayout.SOUTH);
            
            JPanel btnPanel = new JPanel();
            btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            btnPanel.setBorder(new LineBorder(Color.CYAN));
            
            JButton izq = new JButton("<-");
            btnPanel.add(izq);
            
            JButton der = new JButton("->");
            btnPanel.add(der);
            
            JButton yes = new JButton("YES");
            btnPanel.add(yes);
            
            JButton no = new JButton("NO");
            btnPanel.add(no);
            
            this.add(btnPanel);
            izq.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("IZQ Clicked");
                }
            });
            
            der.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                }
                
            });
            
            yes.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                }
                
            });
            
            no.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                }
                
            });
            
            
            
            //this.add(main,BorderLayout.CENTER);
            this.setVisible(true);
                
	}
	
	public void setReceptor(Receptor receptor) {
		this.receptor = receptor;
	}
	
	public void terminar() {
		
	}
        
    
}
