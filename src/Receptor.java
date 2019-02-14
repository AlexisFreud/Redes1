
public class Receptor {
	private char[] caracteresRecibidos;
	private int[] caracterBinario;
	private PanelR panel;
	private int posicionBinario, posicionRecibidos;
	
	public Receptor() {
		this.caracterBinario = new int[5];
		this.caracteresRecibidos = new char[30];
		this.posicionBinario = 0;
		this.posicionRecibidos = 0;
	}
	
	public void setPanel(PanelR panel) {
		this.panel = panel;
	}
	
	public void responder(int correcto) {
		
	}
	
	public String siguienteCaracter() {
		//try {
			char caracter = Traductor.traducir(this.caracterBinario);
			
		//} catch(IndexOutOfBoundsException e) {
			//this.panel.notFound();
		//}
		this.addCaracter(caracter);
		this.vaciarArray();
		return String.valueOf(caracter);
	}
	
	public void addCaracter(char ch) {
		this.caracteresRecibidos[posicionRecibidos] = ch;
		this.posicionRecibidos++;
	}
	
	public void vaciarArray() {
		this.caracterBinario = new int[5];
		this.posicionBinario = 0;
	}

	public char[] getCaracteresRecibidos() {
		return this.caracteresRecibidos;
	}
	
	public void addCaracterBinario(int n) {
		if(posicionBinario<caracterBinario.length-1) {
			this.caracterBinario[++posicionBinario] = n;
		}
		
	}
	
	public void repetirPorfavor() {
		Speaker.alarma();
		System.out.println("REPITE");
		this.vaciarArray();
	}
	
}
