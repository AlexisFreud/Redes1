
public class Receptor {
	private char[] caracteresRecibidos;
	private int[] caracterBinario;
	private PanelR panel;
	private int posicionBinario, posicionRecibidos;
	
	public Receptor() {
		this.caracteresRecibidos = new char[30];
		this.posicionBinario = 0;
		this.posicionRecibidos = 0;
	}
	
	public void setPanel(PanelR panel) {
		this.panel = panel;
	}
	
	public void responder(int correcto) {
		
	}
	
	public void siguienteCaracter() {
		this.addCaracter(Traductor.traducir(this.caracterBinario));
		this.vaciarArray();
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
}
