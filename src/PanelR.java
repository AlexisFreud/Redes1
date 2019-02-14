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
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PanelR extends JPanel {
        //private JFrame frame;
	private Receptor receptor;
	private boolean willEnd,calculando;
	private JLabel lbTitulo,
				   lbCola,
				   lbCaracteresRecibidos,
				   lbLeyendas,
				   lbAnnounce,
				   lbStatic;
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
       
        JPanel billboard = new JPanel();
        
       
        this.setLayout(new BorderLayout());
        
        this.add(billboard, BorderLayout.CENTER);
        billboard.setLayout(new BorderLayout());
        
        this.lbAnnounce = new JLabel("Listo para calcular!");
        this.lbAnnounce.setHorizontalAlignment(SwingConstants.CENTER);
        lbAnnounce.setFont(lbAnnounce.getFont().deriveFont(70.0f));
        billboard.add(lbAnnounce,BorderLayout.CENTER);
        
        this.lbStatic = new JLabel("Caracteres recibidos:");
        this.lbStatic.setFont(lbStatic.getFont().deriveFont(25.0f));
        
        billboard.add(lbStatic,BorderLayout.SOUTH);
         
        this.lbTitulo = new JLabel("Receptor "+ recep + " ("+instrument(dest)+")");
        this.lbTitulo.setFont(lbTitulo.getFont().deriveFont(50.0f));
        this.lbTitulo.setBorder(new LineBorder(Color.BLACK));
        this.add(lbTitulo,BorderLayout.NORTH);
        
        this.lbCola = new JLabel();
        this.lbCola.setFont(lbTitulo.getFont().deriveFont(45.0f));
        this.lbCola.setBorder(new LineBorder(Color.BLACK));
        this.add(lbCola,BorderLayout.EAST);
        
        this.lbCaracteresRecibidos = new JLabel();
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
					calculando = true;
					receptor.addCaracterBinario(1);
					enQueue("BALAZOS<br/>");
					if(willEnd) {
						willEnd = false;
						lbCaracteresRecibidos.setText(lbCaracteresRecibidos.getText() + receptor.siguienteCaracter());
						calculando = false;
						lbCola.setText("");
						
					}
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
					calculando = true;
					receptor.addCaracterBinario(2);
					enQueue("TAMBORES<br/>");
					if(willEnd) {
						willEnd = false;
						lbCaracteresRecibidos.setText(lbCaracteresRecibidos.getText() + receptor.siguienteCaracter());
						calculando = false;
						lbCola.setText("");
						
					}
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_ESCAPE) {
					receptor.repetirPorfavor();
					lbCola.setText("");
					
					calculando = false;
				}
				else if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
					if(!calculando) {
						removeLastCharacter();
						System.out.println("Borrando ultimo caracter");
						receptor.vaciarArray();
						lbCola.setText("");
						
					}
					
					
					
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_F) {
					calculando = true;
					receptor.addCaracterBinario(4);
					enQueue("ALARMA<br/>");
					willEnd = true;
					
				}
				else if(ke.getKeyCode() == KeyEvent.VK_SPACE) {
					calculando = true;
					receptor.addCaracterBinario(3);
					enQueue("FUNK<br/>");
					if(willEnd) {
						willEnd = false;
						lbCaracteresRecibidos.setText(lbCaracteresRecibidos.getText() + receptor.siguienteCaracter());
						calculando = false;
						lbCola.setText("");
					}
				}
				
				
				if(calculando) {
					lbAnnounce.setText("Calculando...");
				}else {
					lbAnnounce.setText("Listo para calcular!");
				}
				
				
			}

			

			@Override
			public void keyReleased(KeyEvent ke) {}

			@Override
			public void keyTyped(KeyEvent arg0) {}
			
		});
		
	}
	
	private void removeLastCharacter() {
		if(lbCaracteresRecibidos.getText().length()>0) {
			lbCaracteresRecibidos.setText(lbCaracteresRecibidos.getText().substring(0, lbCaracteresRecibidos.getText().length()-1));
		}
	}
	
	public void notFound() {
		lbAnnounce.setText("No encontrado, calcula de nuevo...");
		receptor.repetirPorfavor();
		lbCola.setText("");
		calculando = false;
	}
	
	public void setReceptor(Receptor receptor) {
		this.receptor = receptor;
	}
	
	public void terminar() {
		
	}
        
    
}
