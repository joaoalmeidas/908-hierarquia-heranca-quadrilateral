
public class Quadrilateral {
	
	private Ponto[] coordenadas = new Ponto[4];

	public Quadrilateral(Ponto zero, Ponto um, Ponto dois, Ponto tres) {
		super();
		this.coordenadas[0] = zero;
		this.coordenadas[1] = um;
		this.coordenadas[2] = dois;
		this.coordenadas[3] = tres;
	}
	
	public Quadrilateral(Ponto zero, Ponto um, Ponto dois) {
		
		this.coordenadas[0] = zero;
		this.coordenadas[1] = um;
		this.coordenadas[2] = dois;
		
		dois.setX(dois.getX() - (um.getX() - zero.getX()));
		
		this.coordenadas[3] = dois;
		
	}
	
	public Ponto[] getCoordenadas() {
		return coordenadas;
	}
	
	public double calculaAltura() {
		
		return getCoordenadas()[0].getY() - getCoordenadas()[3].getY();
		
	}


	
	public double calculaBase() {
		
		return Math.sqrt(
				Math.pow((getCoordenadas()[2].getX() - getCoordenadas()[3].getX()), 2) + 
				Math.pow((getCoordenadas()[2].getY() - getCoordenadas()[3].getY()), 2));
		
		
	}
	
	
	@Override
	public String toString() {
		
		return String.format("%s: %n(%d, %d), (%d, %d), (%d, %d), (%d, %d)",
							"Pontos do Quadrilatero",
							getCoordenadas()[0].getX(), getCoordenadas()[0].getY(),
							getCoordenadas()[1].getX(), getCoordenadas()[1].getY(),
							getCoordenadas()[2].getX(), getCoordenadas()[2].getY(),
							getCoordenadas()[3].getX(), getCoordenadas()[3].getY());
		
	}
	

}
