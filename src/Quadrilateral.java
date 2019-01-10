
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

	public double calculaDistanciaEntrePontos(Ponto a, Ponto b) {
		
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		
	}
	

}
