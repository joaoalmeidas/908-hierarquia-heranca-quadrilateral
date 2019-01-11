
public class Paralelograma extends Quadrilateral {

	public Paralelograma(Ponto zero, Ponto um, Ponto dois) {
		super(zero, um, dois);
	}
	
	public Paralelograma(Ponto zero, Ponto dois) {
		super(zero, dois);
	}
	
	public double calculaArea() {
		return calculaBase() * calculaAltura();
	}
	
	@Override
	public String toString() {
		
		return String.format("%s %nBase do %s: %.1f%nAltura do %s: %.1f%n%nArea do %s: %.1f", super.toString(),
				getClass().getSimpleName(),
				calculaBase(), getClass().getSimpleName(), calculaAltura(), getClass().getSimpleName(), calculaArea());
		
	}

}
