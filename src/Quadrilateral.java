
public class Quadrilateral {
	
	private Ponto[] coordenadas = new Ponto[4];

	public Quadrilateral(Ponto zero, Ponto um, Ponto dois, Ponto tres) {
		super();
		this.coordenadas[0] = zero;
		this.coordenadas[1] = um;
		this.coordenadas[2] = dois;
		this.coordenadas[3] = tres;
	}
	
	public Ponto[] getCoordenadas() {
		return coordenadas;
	}

	private double calculaDistanciaEntrePontos(Ponto a, Ponto b) {
		
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		
	}
	
	public double calculaDistanciaEntre0e1() {
		
		return calculaDistanciaEntrePontos(getCoordenadas()[0], getCoordenadas()[1]);
		
	}
	
	public double calculaDistanciaEntre1e2() {
		
		return calculaDistanciaEntrePontos(getCoordenadas()[1], getCoordenadas()[2]);
		
	}

	public double calculaDistanciaEntre2e3() {
	
		return calculaDistanciaEntrePontos(getCoordenadas()[2], getCoordenadas()[3]);
	
	}

	public double calculaDistanciaEntre3e0() {
		
		return calculaDistanciaEntrePontos(getCoordenadas()[3], getCoordenadas()[0]);
		
	}
	
	

}
