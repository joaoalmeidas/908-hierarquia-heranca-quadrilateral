
public class Trapezio extends Quadrilateral {

	public Trapezio(Ponto zero, Ponto um, Ponto dois, Ponto tres) {
		super(zero, um, dois, tres);

	}
	
	public double encontraBaseMenor() {
		
		if(calculaDistanciaEntre0e1() < calculaDistanciaEntre2e3()) {
			
			return calculaDistanciaEntre0e1();
			
		}else{
			
			return calculaDistanciaEntre2e3();
			
		}
		
	}
	
	public double encontraBaseMaior() {
		
		if(calculaDistanciaEntre0e1() > calculaDistanciaEntre2e3()) {
			
			return calculaDistanciaEntre0e1();
			
		}else{
			
			return calculaDistanciaEntre2e3();
			
		}
		
	}
	
	public double calculaAltura() {
		
		return getCoordenadas()[0].getY() - getCoordenadas()[3].getY();
		
	}
	
	public double calculaArea() {
		
		return ((encontraBaseMaior() + encontraBaseMenor()) * calculaAltura())/2;
				
	}
}
