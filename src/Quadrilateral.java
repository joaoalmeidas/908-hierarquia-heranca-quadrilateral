
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
		
		Ponto tres = new Ponto(dois.getX() - (um.getX() - zero.getX()), dois.getY());
		
		this.coordenadas[0] = zero;
		this.coordenadas[1] = um;
		this.coordenadas[2] = dois;
		this.coordenadas[3] = tres;
		
	}
	
	public Quadrilateral(Ponto zero, Ponto dois) {
		
		Ponto um = new Ponto(zero.getY(), dois.getX()); 
		Ponto tres = new Ponto(zero.getX(), dois.getY());
		
		this.coordenadas[0] = zero;
		this.coordenadas[1] = um;
		this.coordenadas[2] = dois;
		this.coordenadas[3] = tres;
		
	}
	
	public Ponto[] getCoordenadas() {
		return coordenadas;
	}
	
	public double calculaAltura() {
		
		return getCoordenadas()[0].getY() - getCoordenadas()[2].getY();
		
	}


	
	public double calculaBase() {
		
		return getCoordenadas()[2].getX() - getCoordenadas()[3].getX();
		
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
