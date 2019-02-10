import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelR extends JPanel {
	private Receptor receptor;
	private JLabel lbTitulo,
				   lbCola,
				   lbCaracteresRecibidos,
				   lbLeyendas;
	
	public PanelR() {
		super();
		this.lbTitulo = new JLabel("Titulo");
		this.lbCola = new JLabel("Cola");
		this.lbCaracteresRecibidos = new JLabel("Caracteres recibidos:");
		this.lbLeyendas = new JLabel("LEYENDAS");
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(1280, 720));
		
		this.add(this.lbTitulo);
		this.add(this.lbCola);
		this.add(this.lbCaracteresRecibidos);
		this.add(this.lbLeyendas);
	}
	
	public void setReceptor(Receptor receptor) {
		this.receptor = receptor;
	}
	
	public void terminar() {
		
	}
}
