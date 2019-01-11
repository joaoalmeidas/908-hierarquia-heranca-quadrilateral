
public class Retangulo extends Paralelograma {

	public Retangulo(Ponto zero, Ponto dois) {
		super(zero, dois);
	}
	
	public String toString() {
		return String.format("%s %nBase do Retângulo: %.1f%nAltura do Retângulo: %.1f%n%nArea do Retângulo: %.1f",
				super.toString(),calculaBase(), calculaAltura(), calculaArea());
	}
	

}
