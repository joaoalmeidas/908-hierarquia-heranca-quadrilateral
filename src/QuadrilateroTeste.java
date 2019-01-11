
public class QuadrilateroTeste {

	public static void main(String[] args) {
		
		Ponto a = new Ponto(14, 12);
		Ponto b = new Ponto(46, 12);
		Ponto c = new Ponto(30, 0);
		Ponto d = new Ponto(0, 0);
		
		Trapezio trap = new Trapezio(a, b, c, d);
		
		System.out.println("Trapezio\n");
		
		System.out.println(trap);
		
		a.alteraPonto(1, 7);
		b.alteraPonto(5, 7);
		c.alteraPonto(7, 0);
		
		Paralelograma par = new Paralelograma(a, b, c);
		
		System.out.println("\nParalelograma\n");
		
		System.out.println(par);
		
		a.alteraPonto(0, 0);
		c.alteraPonto(9, 2);
		
		Retangulo ret = new Retangulo(a, c);
		
		System.out.println("\nRetângulo\n");
		
		System.out.println(ret);
		
		a.alteraPonto(9, 9);
		c.alteraPonto(20, 20);
		
		Quadrado quad = new Quadrado(a, c);
		
		System.out.println("\nQuadrado\n");
		
		System.out.println(quad);
	}

}
