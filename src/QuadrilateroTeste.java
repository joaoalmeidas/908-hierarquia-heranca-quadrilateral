
public class QuadrilateroTeste {

	public static void main(String[] args) {
		
		Ponto a = new Ponto(14, 12);
		Ponto b = new Ponto(46, 12);
		Ponto c = new Ponto(30, 0);
		Ponto d = new Ponto(0, 0);
		
		Trapezio trap = new Trapezio(a, b, c, d);
		
		System.out.println("Trapezio\n");
		
		System.out.println(trap);
	}

}
