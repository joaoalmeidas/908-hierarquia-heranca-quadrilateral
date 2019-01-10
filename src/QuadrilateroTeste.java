
public class QuadrilateroTeste {

	public static void main(String[] args) {
		
		Ponto a = new Ponto(1, 2);
		Ponto b = new Ponto(5, 2);
		Ponto c = new Ponto(5, 0);
		Ponto d = new Ponto(1, 0);
		
		Quadrilateral quad = new Quadrilateral(a, b, c, d);
		
		System.out.println(quad.calculaDistanciaEntre0e1());
	}

}
