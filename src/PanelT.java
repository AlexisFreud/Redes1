import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import static javax.swing.GroupLayout.Alignment.*;

import javax.swing.*;

public class PanelT extends JPanel {
	
	private Transmisor transmisor;
	private JLabel lblCaracteres,
				   lblDestinatario,
				   lblInformacion,
				   lblIniciar,
				   lblRepetir,
				   lblSiguiente,
				   lblT,
				   lbln,
				   lbl25;
		
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
		this.lblT = new JLabel("Transmitiendo a: ");
		int n= 0; 
		this.lbln = new JLabel("Caracter "+ n + " de 25");
		
		
		this.setPreferredSize(new Dimension(1280, 720));
		
		JPanel main = new JPanel();
        main.setPreferredSize(new Dimension(1250, 703));
        this.setLayout(new BorderLayout());		
		
		JPanel lbl = new JPanel();
		lbl.setLayout(new FlowLayout(FlowLayout.CENTER));
		lbl.setBorder(new LineBorder(Color.CYAN));
		lbl.add(lblCaracteres);
		lbl.add(tfCaracteres);
		lbl.add(lblDestinatario);
		lbl.add(tfDestinatario);
		
		JPanel btn = new JPanel();
		btn.setLayout(new FlowLayout(FlowLayout.CENTER));
		btn.setBorder(new LineBorder(Color.CYAN));
		btn.add(lblIniciar);
		btn.add(btnIniciar);
		btn.add(lblRepetir);
		btn.add(btnRepetir);
		btn.add(lblSiguiente);
		btn.add(btnSiguiente);
		
		btnIniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Iniciar");
            }
        });
		
		btnRepetir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Repetir");
            }
        });
		
		btnSiguiente.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Iniciar");
            }
        });
		
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(1280, 720));
		
		JPanel p4 = new JPanel();
		p4.setLayout(new FlowLayout(FlowLayout.CENTER));
		p4.setBorder(new LineBorder(Color.CYAN));
		p4.add(lblT);
		p4.add(lbln);
		
		main.add(lbl, BorderLayout.NORTH);
		main.add(btn, BorderLayout.CENTER);
		main.add(p4, BorderLayout.SOUTH);
		this.add(main);
	//	this.add(p4);
	//	main.add
		
        
	}
	
	public void setTransmisor(Transmisor transmisor) {
	this.transmisor = transmisor;
	}
	
			
}
