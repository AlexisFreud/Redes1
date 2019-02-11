import javax.sound.midi.*;
public class Speaker {
	/*
	 * Sonido inicio:     87 - any
	 * Sonido Izquierda: 
	 * Sonido derecha:   118 - 40 - 54
	 * Sonido Centro:	 
	 * Sonido Fin:		 124 - 50
	 * 
	 * 
	 * Opcional: 96 - 50
	 * 47 - 50
	 * 57 - 40
	 * 67 - 50
	 * 80 - 30 - 40 - 50 - 60
	 * 81 - 55
	 * 88 - 55 - 60
	 * 123 pajaritos - 50
	 * 124 - 50
	 * 118
	 * 
	 * 30s
	 * 1
	 * 12
	 * 19
	 * 20
	 * 27
	 * 30
	 * 34
	 * 42
	 * 43
	 * 62
	 * 67 alarma
	 * 80
	 * 
	 * 
	 * 50s
	 * 1 Piano SI
	 * 7
	 * 13
	 * 15 sI
	 * 16 TAL VEZ
	 * 19 SI
	 * 20-22
	 * 33 TAL VEZ
	 * 25 Guitarra SI 
	 * 31 - Alarma
	 * 41
	 * 
	 */
	
	/*
	 * Destinatarios:
	 * 1 - 30
	 * 15 - 50
	 * 19 - 50
	 * 25 - 30
	 */
	
	//Sonidos
	private static int[][] Sonidos = {{87, 40, 3},
									  {118, 40, 2},
									  {118, 54, 2},
									  {80, 40, 2},
									  {124, 60, 2}};
	//Destinatarios
	private static int[][] Destinatarios = {{1,35,2},  //Destinatario 1
										   {15,60,2},  //Destinatario 2
										   {19,50,2},  //Destinatario 3
										   {25,50,2}}; //Destinatario 4
	
	public static void reproducirSonido(int[] sonido, int destinatario, boolean lento) {
		boolean fin = false;
		String posicion = "";
		for(int s: sonido) {
			if(s == 0) {
				if(fin) break;
				else {
					System.out.println("Destinatario: "+destinatario);
					fin = true;
					reproducirSonido(destinatario);
				}
			}else {
				/*
				 * Borrar
				 */
				if(s == 1) {
					posicion = "Izquierda";
				}else if(s == 2) {
					posicion = "Derecha";
				}else if(s == 3) {
					posicion = "Centro";
				}else {
					posicion = "Final";
				}
				System.out.println("Sonido de "+posicion);
				/*
				 * Borrar
				 */
				if(lento) {
				reproducirSonido(s, 300);
				}else {
				reproducirSonido(s, 150);
				}
			}
			Timer.esperar(true);
		}
	}
	
	private static void reproducirSonido(int sonido, int velocidad) {
		configurar(Sonidos[sonido][0],
				   Sonidos[sonido][1],
				   Sonidos[sonido][2], velocidad);
	}
	
	private static void reproducirSonido(int destinatario) {
		configurar(Destinatarios[destinatario][0],
				   Destinatarios[destinatario][1],
				   Destinatarios[destinatario][2], 500);
	}
	
	private static void configurar(int instrument, int note, int sounds, int velocidad) 
    { 
  
        try { 
            for(int i = 0; i < sounds; i++) {
            	Sequencer sequencer = MidiSystem.getSequencer(); 
                sequencer.open(); 
                Sequence sequence = new Sequence(Sequence.PPQ, 4); 
                Track track = sequence.createTrack(); 
                track.add(eventoMidi(192, 1, instrument, 0, 1));
                track.add(eventoMidi(144, 1, note, 100, 1));
                track.add(eventoMidi(128, 1, note, 100, 4)); 
                sequencer.setSequence(sequence); 
                sequencer.start(); 
                Thread.sleep(velocidad);
            }
        } 
        catch (Exception ex) { 
            ex.printStackTrace(); 
        } 
    } 
	
	private static MidiEvent eventoMidi(int command, int channel, int note, int velocity, int tick) 
	{ 
		MidiEvent event = null; 
		try { 
			ShortMessage a = new ShortMessage(); 
			a.setMessage(command, channel, note, velocity); 
			event = new MidiEvent(a, tick); 
		} 
		catch (Exception ex) { 
			ex.printStackTrace(); 
		} 
		return event; 
	} 
}
