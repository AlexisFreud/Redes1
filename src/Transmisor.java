public class Transmisor {
    private char[][] mensaje;
    private PanelT panel;
    private int index;
    
    public Transmisor(){
        this.index = -1;
        
    }
    
    public void setPanel(PanelT panel){
        this.panel = panel;
    }
    
    private void enviarCaracter(int[] sonido, int dest, boolean lento){
//        for (int s : sonido) {
//            Speaker.reproducir(s, dest, lento);
//            Timer.esperar(lento);
//        }
    	Speaker.reproducirSonido(sonido, dest, lento);
    }
    
    private int[] traducir(char caracter){
        return Traductor.traducir(caracter);
    }
    
    public void setMessage(String msg, String dest){
        this.mensaje = new char[msg.length()][msg.length()];
        for (int i = 0; i < this.mensaje.length; i++) {
            this.mensaje[0][i] = msg.charAt(i);
            this.mensaje[1][i] = dest.charAt(i);
        }
        this.transmitir(true);
    }
    
    public void transmitir(boolean lento){
        if(lento) {
        	this.index++;
        }
        int[] soundCode = this.traducir(this.mensaje[0][index]);
        int destinatario = (int) this.mensaje[1][index];
        System.out.println(destinatario);
        this.enviarCaracter(soundCode, destinatario-49, lento);
    }
    
}