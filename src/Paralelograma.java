
public class Paralelograma extends Quadrilateral {

	public Paralelograma(Ponto zero, Ponto um, Ponto dois, Ponto tres) {
		super(zero, um, dois, tres);
		
	}
	
	public double calculaArea() {
		return calculaBase() * calculaAltura();
	}
	
	@Override
	public String toString() {
		
		return String.format("%s %nBase do Paralelograma: %.1f%nAltura do Paralelograma: %.1f%n%nArea do Paralelograma: %.1f", super.toString(),
				calculaBase(), calculaAltura(), calculaArea());
		
	}

}
