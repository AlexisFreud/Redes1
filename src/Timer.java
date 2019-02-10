
public class Timer {
	private static final int Rapido = 100, Lento = 1000;
	
	public static void esperar(boolean lento) {
		if(lento)
			try {
				Thread.sleep(Lento);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else {
			try {
				Thread.sleep(Rapido);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
