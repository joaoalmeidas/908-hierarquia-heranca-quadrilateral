
public class Retangulo extends Paralelograma {

	public Retangulo(Ponto zero, Ponto dois) {
		super(zero, dois);
	}
	
	public String toString() {
		return String.format("%s %nBase do Ret�ngulo: %.1f%nAltura do Ret�ngulo: %.1f%n%nArea do Ret�ngulo: %.1f",
				super.toString(),calculaBase(), calculaAltura(), calculaArea());
	}
	

}
