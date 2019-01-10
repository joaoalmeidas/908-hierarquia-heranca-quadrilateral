
public class Trapezio extends Quadrilateral {

	public Trapezio(Ponto zero, Ponto um, Ponto dois, Ponto tres) {
		super(zero, um, dois, tres);

	}
	
	public double calculaOutraBase() {
		
		return getCoordenadas()[2].getY() - getCoordenadas()[3].getY();
		
	}
	
	public double encontraBaseMenor() {
		
		if(calculaBase() < calculaOutraBase()) {
			
			return calculaBase();
			
		}else{
			
			return calculaOutraBase();
			
		}
		
	}
	
	public double encontraBaseMaior() {
		
		if(calculaBase() > calculaOutraBase()) {
			
			return calculaBase();
			
		}else{
			
			return calculaOutraBase();
			
		}
		
	}
	
	
	public double calculaArea() {
		
		return ((encontraBaseMaior() + encontraBaseMenor()) * calculaAltura())/2;
				
	}
	
	@Override
	public String toString() {
		
		return String.format(super.toString()+
							"\nAltura do Trapezio: " +calculaAltura()+
							"\nBase Maior do Trapezio: " +encontraBaseMaior()+
							"\nBase Menot do Trapezio: " +encontraBaseMenor()+
							"\n\nArea do Trapezio: "+calculaArea());
		
	}
}
