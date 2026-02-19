package somaSemSoma;

public class SomaSemSomaController {
	
	public SomaSemSomaController() {
		
	}
	
	public int somaSS(int a, int b) {
		if( b == 0) {
			return a;
		}
		return somaSS(a + 1, b - 1) ;
	}
	
}
