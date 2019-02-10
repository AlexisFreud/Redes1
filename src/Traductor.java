
public class Traductor {
	/*
	 * 1 = Inicio
	 * 2 = Izquierda
	 * 2 = Derecha
	 * 3 = Centro o "c"
	 * 4 = Final
	 */
	
	private final static char[] Array = {'a', 'b', 'c', 'd', 'e',
										 'f', '0', '1', '2', '3',
										 '4', '5', '6', '7', '8', 
										 '9'};
	
	public static int[] traducir(char ch) {
		int[] traduccion = new int[5];
		traduccion[0] = 0;
		int a = 0, b = Array.length - 1, c;
		for(int i = 1; i < 5; i++) {
			c = (a + b) / 2;
			if(ch == Array[c]) {
				traduccion[i] = 4;
				traduccion[i+1] = 3;
				break;
			}else if(ch == Array[a] || ch == Array[b]) {
				traduccion[i] = 4;
				if(ch == Array[a]) {
					traduccion[i+1] = 1;
				}else {
					traduccion[i+1] = 2;
				}
				break;
			}else if(toNumber(ch) < toNumber(Array[c])){
					traduccion[i] = 1;
					a++;
					b = c-1;
			}else {
					traduccion[i] = 2;
					b--;
					a = c+1;
			}
		}
		
		return traduccion;
	}
	
	public static char traducir(int[] ch) {
		int a = 0, b = Array.length - 1, c;
		for(int i = 1; i < 5; i++) {
			c = (a+b)/2;
			if(ch[i] == 4) {
				if(ch[i+1] == 1) {
					return Array[a];
				}else if(ch[i+1] == 2) {
					return Array[b];
				}else {
					return Array[c];
				}
			}else {
				if(ch[i] == 1){
					a++;
					b = c-1;
				}else {
					b--;
					a = c+1;
				}
			}
		}
		return ' ';
	}
	
	private static int toNumber(char c) {
		switch(c){
			case 'a':
				return 0;
			case 'b':
				return 1;
			case 'c':
				return 2;
			case 'd':
				return 3;
			case 'e':
				return 4;
			case 'f':
				return 5;
			case '0':
				return 6;
			case '1':
				return 7;
			case '2':
				return 8;
			case '3':
				return 9;
			case '4':
				return 10;
			case '5':
				return 11;
			case '6':
				return 12;
			case '7':
				return 13;
			case '8':
				return 14;
			case '9':
				return 15;
			default:
				return -1;
		}
	}
}
