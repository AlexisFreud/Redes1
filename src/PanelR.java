import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PanelR extends JPanel {
        //private JFrame frame;
	private Receptor receptor;
	private boolean willEnd;
	private JLabel lbTitulo,
				   lbCola,
				   lbCaracteresRecibidos,
				   lbLeyendas;
        private String recep,
                        instrumento;
	
    private String instrument(String dest) {
    	switch(dest) {
    	case "A": return "Piano Grave"; 
    	case "a": return "Piano Grave"; 
    	case "B": return "Piano Agudo";
    	case "b": return "Piano Agudo";
    	case "C": return "Organo"; 
    	case "c": return "Organo"; 
    	case "D": return "Guitarra";
    	case "d": return "Guitarra";
    	}
    	return null;
    }
    
    private void enQueue(String termino) {
    	String txt = lbCola.getText().replace("<html/>","");
    	txt = txt.replace("<html>", "");
    	lbCola.setText("<html>"+txt+termino+"<html/>");
    }
    
	public PanelR(String dest) {
            super();
            this.setPreferredSize(new Dimension(1280, 720));
            this.setFocusable(true);
            this.recep = dest;
           
            JPanel main = new JPanel();
            main.setPreferredSize(new Dimension(1250, 703));
            this.setLayout(new BorderLayout());
             
            this.lbTitulo = new JLabel("Receptor "+ recep + " ("+instrument(dest)+")");
            this.lbTitulo.setFont(lbTitulo.getFont().deriveFont(50.0f));
            this.lbTitulo.setBorder(new LineBorder(Color.BLACK));
            this.add(lbTitulo,BorderLayout.NORTH);
            
            
            
            this.lbCola = new JLabel();
            this.lbCola.setFont(lbTitulo.getFont().deriveFont(45.0f));
            this.lbCola.setBorder(new LineBorder(Color.BLACK));
            this.add(lbCola,BorderLayout.EAST);
            
            this.lbCaracteresRecibidos = new JLabel("Caracteres recibidos:");
            this.lbCaracteresRecibidos.setFont(lbCaracteresRecibidos.getFont().deriveFont(30.0f));
            this.lbCaracteresRecibidos.setBorder(new LineBorder(Color.BLACK));
            this.add(lbCaracteresRecibidos,BorderLayout.SOUTH);
           
            
            
            this.addListeners();
            
            
            this.setVisible(true);
                
	}
	
	private void addListeners() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent ke) {
				if(ke.getKeyCode() == KeyEvent.VK_LEFT) {
					receptor.addCaracterBinario(1);
					enQueue("BALAZOS<br/>");
					if(willEnd) {
						willEnd = false;
						lbCaracteresRecibidos.setText(lbCaracteresRecibidos.getText() + receptor.siguienteCaracter());
						lbCola.setText("");
						
					}
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
					receptor.addCaracterBinario(2);
					enQueue("TAMBORES<br/>");
					if(willEnd) {
						willEnd = false;
						lbCaracteresRecibidos.setText(lbCaracteresRecibidos.getText() + receptor.siguienteCaracter());
						lbCola.setText("");
						
					}
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
					receptor.repetirPorfavor();
					lbCola.setText("");
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_F) {
					receptor.addCaracterBinario(4);
					enQueue("ALARMA<br/>");
					willEnd = true;
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_SPACE) {
					receptor.addCaracterBinario(3);
					enQueue("FUNK<br/>");
					if(willEnd) {
						willEnd = false;
						lbCaracteresRecibidos.setText(lbCaracteresRecibidos.getText() + receptor.siguienteCaracter());
						lbCola.setText("");
						
					}
				}
				else if(ke.getKeyCode()== KeyEvent.VK_R) {
					receptor.repetirPorfavor();
					lbCola.setText("");
					
					
				}
			}

			@Override
			public void keyReleased(KeyEvent ke) {}

			@Override
			public void keyTyped(KeyEvent arg0) {}
			
		});
		
	}

	public void setReceptor(Receptor receptor) {
		this.receptor = receptor;
	}
	
	public void terminar() {
		
	}
        
    
}
