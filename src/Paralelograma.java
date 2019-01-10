
public class Paralelograma extends Quadrilateral {

	public Paralelograma(Ponto zero, Ponto um, Ponto dois, Ponto tres) {
		super(zero, um, dois, tres);
		
	}
	
	public double calculaArea() {
		return calculaDistanciaEntre0e1() * calculaAltura();
	}
	

}
