import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;

import javax.swing.*;

public class PanelT extends JFrame {
//	private Transmisor transmisor;
	private JLabel lblCaracteres,
				   lblDestinatario,
				   lblInformacion,
				   lblIniciar,
				   lblRepetir,
				   lblSiguiente;
	private JTextField tfCaracteres,
					   tfDestinatario;
	private JButton btnIniciar,
				    btnRepetir,
				    btnSiguiente;
	
	public PanelT() {
		super();
		this.lblCaracteres = new JLabel("Caracteres");
		this.lblDestinatario = new JLabel("Destinatario");
		this.lblInformacion = new JLabel("Informacion");
		this.lblIniciar = new JLabel("Iniciar");
		this.lblRepetir = new JLabel("Repetir");
		this.lblSiguiente = new JLabel("Siguiente");
		this.tfCaracteres = new JTextField("Caracteres");
		this.tfDestinatario = new JTextField("Destinatario");
		this.btnIniciar = new JButton("Iniciar");
		this.btnRepetir = new JButton("Repetir");
		this.btnSiguiente = new JButton("Siguiente");
		
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(1280, 720));
		
		GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setVerticalGroup(layout.createSequentialGroup()
        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        				.addComponent(lblCaracteres)
        				.addComponent(tfCaracteres))
        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        				.addComponent(lblDestinatario)
        				.addComponent(tfDestinatario))
        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        				.addComponent(btnIniciar)
        				.addComponent(btnRepetir)
        				.addComponent(btnSiguiente))
        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        				.addComponent(btnIniciar)
        				.addComponent(btnRepetir)
        				.addComponent(btnSiguiente))
        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        				.addComponent(lblIniciar)
        				.addComponent(lblRepetir)
        				.addComponent(lblSiguiente))
        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        				.addComponent(lblCaracteres)
        				.addComponent(lblDestinatario)
        				.addComponent(lblInformacion))
        );
     //   layout.linkSize(SwingConstants.HORIZONTAL, findButton, cancelButton);
        
        layout.setHorizontalGroup(layout.createSequentialGroup()
        		.addGroup(layout.createParallelGroup(LEADING)
        				.addComponent(lblCaracteres)
        				.addComponent(lblDestinatario))
        		.addGroup(layout.createParallelGroup()
        				 .addGroup(layout.createParallelGroup(LEADING)
        						.addComponent(tfCaracteres)
        	        			.addComponent(tfDestinatario))
        				 .addGroup(layout.createParallelGroup(LEADING)
        						 .addComponent(btnIniciar)
        	        			 .addComponent(btnRepetir)
        	        			 .addComponent(btnSiguiente))
        				 .addGroup(layout.createParallelGroup(LEADING)
        						 .addComponent(lblIniciar)
        	        			 .addComponent(lblRepetir)
        	        			 .addComponent(lblSiguiente))
        				 .addGroup(layout.createParallelGroup(LEADING)
        						 .addComponent(lblIniciar)
        	        			 .addComponent(lblRepetir)
        	        			 .addComponent(lblSiguiente)))
         );
	/*	
		this.add(this.lblCaracteres);
		this.add(this.lblDestinatario);
		this.add(this.lblInformacion);
		this.add(this.tfCaracteres);
		this.add(this.tfDestinatarios);
		this.add(this.btnIniciar);
		this.add(this.btnRepetir);
		this.add(this.btnSiguiente);
	*/
        setTitle("Transmisor");
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
//	public void setTransmisor(Transmisor transmisor) {
//	this.transmisor = transmisor;
//	}
	public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(
                                  "javax.swing.plaf.metal.MetalLookAndFeel");
                                //  "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                                //UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new PanelT().setVisible(true);
            }
        });
    }
			
}
