
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

	public void setCoordenadas(Ponto[] coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public int calculaDistanciaPonto0APonto1() {
		
		return getCoordenadas()[1].getX() - getCoordenadas()[0].getX();
		
	}
	
	public int calculaDistanciaPonto2APonto3() {
		
		return getCoordenadas()[3].getX() - getCoordenadas()[2].getX();
		
	}
	

}
